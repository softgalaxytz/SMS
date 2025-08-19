package com.sms.api.Roles;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_table")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long role_id;
    @Column(unique = true)
    private String role_name;
}