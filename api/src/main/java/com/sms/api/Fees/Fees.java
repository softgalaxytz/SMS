package com.sms.api.Fees;

import java.time.LocalDate;

import lombok.Data;
@Data
public class Fees {
    private Long fee_id;
    private Long student_id;
    private LocalDate fee_due_date;
    private Double fee_amount;
    private String fee_status;

    // Getters and Setters
}
