package com.sms.api.Students;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "students_table")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_id;
    private String student_firstname;
    private String student_lastname;
    private String student_gender;
    private String student_dob;
    private String student_address;
    private Long class_id;
    private Long parent_id;
    // Getters and Setters
}
