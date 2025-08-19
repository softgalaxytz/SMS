package com.sms.api.Authentication;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.api.Authentication.DTO.School_account_request;
@Service
public class AuthServices {

    @Autowired
    private final AuthRepo authRepo;

    public AuthServices(AuthRepo authRepo) {
        this.authRepo = authRepo;
    }
// Register a new school account
    public School_account_request registerSchool(School_account_request user) {
      
        School_accounts newUser = new School_accounts();
        newUser.setSchool_name(user.getSchool_name());
        newUser.setSchool_email(user.getSchool_email());
        newUser.setSchool_password(user.getSchool_password());
        newUser.setRoles_id(user.getRoles_id());
        authRepo.save(newUser);
        return user;
    }
// Login a school account
    public List<Map<String, Object>> login(String school_email, String school_password) {

        return authRepo.findbySchool_email(school_email, school_password);
    }
}
