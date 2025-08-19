package com.sms.api.Authentication;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.api.Authentication.DTO.user_dto;
@Service
public class AuthServices {

    @Autowired
    private final AuthRepo authRepo;

    public AuthServices(AuthRepo authRepo) {
        this.authRepo = authRepo;
    }
// Register a new school account
    public user_dto register(user_dto user) {
      
        Users_table newUser = new Users_table();
        newUser.setUser_name(user.getUser_name());
        newUser.setUser_email(user.getUser_email());
        newUser.setUser_password(user.getUser_password());
        newUser.setRoles_id(user.getRoles_id());
        authRepo.save(newUser);
        return user;
    }
// Login a school account
    public List<Map<String, Object>> login(String user_email, String user_password) {

        return authRepo.findbyUser_email(user_email, user_password);
    }
}
