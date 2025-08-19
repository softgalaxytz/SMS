package com.sms.api.Authentication;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "school_accounts")
public class School_accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long school_id;
    private String school_name;
    @Column(unique = true)
    private String school_email;
    private String school_password;
    private Long roles_id;

    // Getters and Setters
}
