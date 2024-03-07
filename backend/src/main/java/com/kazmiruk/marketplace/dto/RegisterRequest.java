package com.kazmiruk.marketplace.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank
    @Size(min = 4, max = 20)
    private String firstName;

    @Email
    @NotBlank
    private String email;

    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}",
            message = "Пароль повинен скалдатися з 8 символів " +
                    "та містити хоча б одну велику, одну малу латинські " +
                    "літери та мінімум одну цифру")
    private String password;
}
