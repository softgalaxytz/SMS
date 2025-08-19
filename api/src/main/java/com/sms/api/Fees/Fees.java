package com.sms.api.Fees;

import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "fees_table")
public class Fees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fee_id;
    private Long student_id;
    private LocalDate fee_due_date;
    private Double fee_amount;
    private String fee_status;

    // Getters and Setters
}
