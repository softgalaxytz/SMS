package com.sms.api.Authentication.DTO;

import lombok.Data;

@Data
public class School_account_request {
    private String school_name;
    private String school_email;
    private String school_password;
    private Long roles_id;
}
