package com.manas.controller;

import com.manas.dto.request.AuthRequest;
import com.manas.dto.request.RegisterRequest;
import com.manas.dto.response.AuthResponse;
import com.manas.service.AuthService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authentication")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest registerRequest){
        return authService.register(registerRequest);
    }

    @PostMapping("/login")
    public AuthResponse authenticate(@RequestBody AuthRequest authRequest){
        return authService.authenticate(authRequest);
    }
}
