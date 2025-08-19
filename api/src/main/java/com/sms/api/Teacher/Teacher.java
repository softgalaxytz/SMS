package com.sms.api.Teacher;

import java.time.LocalDate;

import lombok.Data;
import jakarta.persistence.*;


@Data
@Entity
@Table(name = "teachers_table")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
