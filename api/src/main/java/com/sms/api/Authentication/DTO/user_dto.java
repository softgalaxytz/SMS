package com.sms.api.Authentication.DTO;

import lombok.Data;

@Data
public class user_dto {
    private String user_name;
    private String user_email;
    private String user_password;
    private Long roles_id;
}
