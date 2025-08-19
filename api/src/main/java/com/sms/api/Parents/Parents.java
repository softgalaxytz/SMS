package com.sms.api.Parents;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "parents_table")
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parent_id;
    private String parent_firstname;
    private String parent_lastname;
    private String parent_phone_1; 
    private String parent_phone_2;    
    private Long student_id;

    // Getters and Setters
}
