package com.sms.api.Classes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "classes_table")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long class_id;
    private String class_name;
    private Long teacher_id;
    private Long subject_id;

    // Getters and Setters
}
