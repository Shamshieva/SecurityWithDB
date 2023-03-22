package com.manas.dto.response;

import lombok.Builder;

@Builder
public class AuthResponse {
    private String email;
    private String token;
}
