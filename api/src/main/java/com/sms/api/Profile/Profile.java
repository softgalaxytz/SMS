package com.sms.api.Profile;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "profile_table")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profile_id;
    private String profile_name;
    private String profile_description;
}
