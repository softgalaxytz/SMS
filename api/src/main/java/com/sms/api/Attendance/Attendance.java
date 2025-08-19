package com.sms.api.Attendance;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class Attendance {
    private Long attendance_id;
    private Long student_id;
    private Long class_id;
    private String attendance_status;
    private LocalDateTime attendance_dateTime;

    // Getters and Setters
}
