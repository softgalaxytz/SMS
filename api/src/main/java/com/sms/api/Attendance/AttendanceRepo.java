package com.sms.api.Attendance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepo extends JpaRepository<Attendance,Long> {
    
}
