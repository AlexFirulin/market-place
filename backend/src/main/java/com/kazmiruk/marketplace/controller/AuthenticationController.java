package com.kazmiruk.marketplace.controller;

import com.kazmiruk.marketplace.dto.AuthenticationRequest;
import com.kazmiruk.marketplace.dto.AuthenticationResponse;
import com.kazmiruk.marketplace.dto.RegisterRequest;
import com.kazmiruk.marketplace.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000/")
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestBody RegisterRequest request
    ) {
        try {
            return ResponseEntity.ok(service.register(request));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
