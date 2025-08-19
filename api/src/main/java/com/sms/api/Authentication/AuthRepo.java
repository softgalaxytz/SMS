package com.sms.api.Authentication;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface AuthRepo extends JpaRepository<Users_table, Long> {
    // Method to find a school account by email

    @Query(value = "SELECT u.user_name ,u.user_email  FROM \r\n" + //
                "users_table u\r\n" + //
                "WHERE u.user_email = :user_email AND u.user_password = :user_password", nativeQuery = true)
    List<Map<String, Object>> findbyUser_email(String user_email, String user_password);

}
