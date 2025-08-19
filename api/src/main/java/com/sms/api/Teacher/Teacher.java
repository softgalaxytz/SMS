package com.sms.api.Teacher;

import java.time.LocalDate;

import lombok.Data;
@Data
public class Teacher {
    private Long teacher_id;
    private String teacher_firstname;
    private String teacher_lastname;
    private String teacher_subject_specilization;
    private LocalDate teacher_hire_date;
    private String teacher_phone_number;
    private String teacher_address;
    private Long user_id;

    // Getters and Setters
}
