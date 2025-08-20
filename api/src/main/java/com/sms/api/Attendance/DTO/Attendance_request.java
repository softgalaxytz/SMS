package com.sms.api.Attendance.DTO;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class Attendance_request {
    private Long student_id;
    private Long class_id;
    private String attendance_status;
    private LocalDateTime attendance_dateTime;
    private Long user_id;
}
