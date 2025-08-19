package com.sms.api.Exams;

import lombok.Data;

@Data
public class Exams {
    private Long exam_id;
    private String exam_name;
    private String exam_term;
    private String exam_date;
    private Long class_id;
    private Long subject_id;

    // Getters and Setters
}
