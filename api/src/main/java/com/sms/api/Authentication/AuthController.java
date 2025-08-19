package com.sms.api.Authentication;

import java.util.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.api.Authentication.DTO.School_account_request;
@RestController
@RequestMapping("/api/auth")
public class AuthController {

 
    private final AuthServices authServices;

    public AuthController(AuthServices authServices) {
        this.authServices = authServices;
    }

    // Endpoint to register a new school account
    @PostMapping("/register_school")
    public School_account_request registerSchoolAccount(@RequestBody School_account_request user) {
        return authServices.registerSchool(user);
    }

    @PostMapping("/login")
    public List<Map<String, Object>> loginSchoolAccount(@RequestParam String school_email, @RequestParam String school_password) {
        return authServices.login(school_email, school_password);
    }
}
