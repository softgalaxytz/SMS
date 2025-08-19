package com.sms.api.Results;

import java.time.LocalDateTime;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "results_table")
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long result_id;
    private Long student_id;
    private Long exam_id;
    private String result_grade;
    private String result_remarks;
    private LocalDateTime result_dateTime;

    // Getters and Setters
}
