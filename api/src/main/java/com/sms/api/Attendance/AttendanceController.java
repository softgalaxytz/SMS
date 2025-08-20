package com.sms.api.Attendance;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sms.api.Attendance.DTO.Attendance_request;
@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final AttendanceServices attendanceServices;

    public AttendanceController(AttendanceServices attendanceServices) {
        this.attendanceServices = attendanceServices;
    }
@PostMapping("/create")
    public ResponseEntity<Attendance> createAttendance(@RequestBody Attendance_request attendance_request) {
        Attendance createdAttendance = attendanceServices.saveAttendance(attendance_request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAttendance);
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<Attendance>> getAllAttendances() {
        List<Attendance> attendances = attendanceServices.getAllAttendances();
        return ResponseEntity.ok(attendances);
    }
}
