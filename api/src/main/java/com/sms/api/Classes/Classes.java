package com.sms.api.Classes;

import lombok.Data;

@Data
public class Classes {
    private Long class_id;
    private String class_name;
    private Long teacher_id;
    private Long subject_id;

    // Getters and Setters
}
