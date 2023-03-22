package com.manas.service;

import com.manas.dto.request.AuthRequest;
import com.manas.dto.request.RegisterRequest;
import com.manas.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse  register(RegisterRequest registerRequest);
    AuthResponse authenticate(AuthRequest authRequest);
}
