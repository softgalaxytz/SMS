package com.sms.api.Results;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Results {
    private Long result_id;
    private Long student_id;
    private Long exam_id;
    private String result_grade;
    private String result_remarks;
    private LocalDateTime result_dateTime;

    // Getters and Setters
}
