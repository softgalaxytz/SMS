package com.sms.api.Attendance;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "attendance_table")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendance_id;
    private Long student_id;
    private Long class_id;
    private String attendance_status;
    private LocalDateTime attendance_dateTime;

    // Getters and Setters
}
