package com.sms.api.Subject;

import lombok.Data;

@Data
public class Subject {
    private Long subject_id;
    private String subject_name;
    private String subject_description;
    private String subject_code;
    private Long teacher_id;
    // Getters and Setters
}
