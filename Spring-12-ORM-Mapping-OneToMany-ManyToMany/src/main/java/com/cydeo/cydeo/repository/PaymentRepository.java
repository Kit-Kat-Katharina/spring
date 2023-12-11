package com.cydeo.cydeo.repository;

import com.cydeo.cydeo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
