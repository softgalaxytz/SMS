package com.sms.api.Attendance;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.api.Attendance.DTO.Attendance_request;

@Service
public class AttendanceServices {

    private final AttendanceRepo attendanceRepo;

    public AttendanceServices(AttendanceRepo attendanceRepo) {
        this.attendanceRepo = attendanceRepo;
    }

    // Method to save attendance
    public Attendance saveAttendance(Attendance_request attendance_request) {
        Attendance new_attendance = new Attendance();
        new_attendance.setClass_id(attendance_request.getClass_id());
        new_attendance.setStudent_id(attendance_request.getStudent_id());
        new_attendance.setAttendance_status(attendance_request.getAttendance_status());
        new_attendance.setAttendance_dateTime(attendance_request.getAttendance_dateTime());
        new_attendance.setUser_id(attendance_request.getUser_id());

        return attendanceRepo.save(new_attendance);
    }

    // Method to find attendance by ID
    public Attendance findAttendanceById(Long id) {
        return attendanceRepo.findById(id).orElse(null);
    }

    public List<Attendance> getAllAttendances() {
        return attendanceRepo.findAll();
    }
    // Additional methods for managing attendance can be added here
    
}
