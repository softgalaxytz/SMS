package com.sms.api.Authentication;


import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users_table")
public class Users_table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String user_name;
    @Column(unique = true)
    private String user_email;
    private String user_password;
    private Long roles_id;
    private LocalDateTime created_at;
   

    // Getters and Setters
}
