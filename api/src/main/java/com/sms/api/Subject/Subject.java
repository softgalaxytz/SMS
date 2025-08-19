package com.sms.api.Subject;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "subjects_table")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subject_id;
    private String subject_name;
    private String subject_description;
    private String subject_code;
    private Long teacher_id;
    // Getters and Setters
}
