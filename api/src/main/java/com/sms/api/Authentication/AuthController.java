package com.sms.api.Authentication;

import java.util.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.api.Authentication.DTO.user_dto;
@RestController
@RequestMapping("/api/auth")
public class AuthController {

 
    private final AuthServices authServices;

    public AuthController(AuthServices authServices) {
        this.authServices = authServices;
    }

    // Endpoint to register a new school account
    @PostMapping("/register")
    public user_dto register(@RequestBody user_dto user) {
        return authServices.register(user);
    }

    @PostMapping("/login")
    public List<Map<String, Object>> login(@RequestParam String user_email, @RequestParam String user_password) {
        return authServices.login(user_email, user_password);
    }
}
