package com.sms.api.Parents;

import lombok.Data;

@Data
public class Parents {
    private Long parent_id;
    private String parent_firstname;
    private String parent_lastname;
    private String parent_phone_1; 
    private String parent_phone_2;    
    private Long student_id;

    // Getters and Setters
}
