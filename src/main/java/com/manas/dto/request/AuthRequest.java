package com.manas.dto.request;

import jakarta.validation.constraints.Email;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthRequest {
        @Email
    private String email;
    private String password;
}
