package com.sms.api.Classes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepo extends JpaRepository<Classes, Long> {
    // Additional query methods can be defined here if needed
    
}
