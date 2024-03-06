package com.kazmiruk.marketplace.service;

import com.kazmiruk.marketplace.dto.AuthenticationRequest;
import com.kazmiruk.marketplace.dto.AuthenticationResponse;
import com.kazmiruk.marketplace.dto.RegisterRequest;
import com.kazmiruk.marketplace.entity.Token;
import com.kazmiruk.marketplace.entity.User;
import com.kazmiruk.marketplace.enums.Role;
import com.kazmiruk.marketplace.enums.TokenType;
import com.kazmiruk.marketplace.repository.TokenRepository;
import com.kazmiruk.marketplace.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;


    public AuthenticationResponse register(RegisterRequest request) {
        boolean isUserWithEmailAlreadyExist = userRepository.findByEmail(request.getEmail()).isPresent();
        if (isUserWithEmailAlreadyExist) {
            throw new RuntimeException("User with this email already exists");
        }
        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.BUYER)
                .build();
        var savedUser = repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        saveUserToken(savedUser, jwtToken);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user, jwtToken);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    private void saveUserToken(User user, String jwtToken) {
        var token = Token.builder()
                .user(user)
                .token(jwtToken)
                .type(TokenType.BEARER)
                .expired(false)
                .revoked(false)
                .build();
        tokenRepository.save(token);
    }

    private void revokeAllUserTokens(User user) {
        var validUserTokens = tokenRepository.findAllValidTokenByUserId(user.getId());
        if (!validUserTokens.isEmpty()) {
            validUserTokens.forEach(t -> {
                t.setRevoked(true);
                t.setExpired(true);
            });
            tokenRepository.saveAll(validUserTokens);
        }
    }
}
