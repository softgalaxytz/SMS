package com.sms.api.Exams;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "exams_table")
public class Exams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exam_id;
    private String exam_name;
    private String exam_term;
    private String exam_date;
    private Long class_id;
    private Long subject_id;

    // Getters and Setters
}
