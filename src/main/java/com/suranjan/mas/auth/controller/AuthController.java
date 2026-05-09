package com.suranjan.mas.auth.controller;

import com.suranjan.mas.auth.dto.AuthResponse;
import com.suranjan.mas.auth.dto.LoginRequest;
import com.suranjan.mas.auth.entity.User;
import com.suranjan.mas.auth.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return service.signup(user);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return service.login(request);
    }
}
