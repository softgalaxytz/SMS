package com.sms.api.Authentication;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface AuthRepo extends JpaRepository<School_accounts, Long> {
    // Method to find a school account by email

    @Query(value = "SELECT u.school_name ,u.school_email  FROM \r\n" + //
                "School_accounts u\r\n" + //
                "WHERE u.school_email = :school_email AND u.school_password = :school_password", nativeQuery = true)
    List<Map<String, Object>> findbySchool_email(String school_email, String school_password);

}
