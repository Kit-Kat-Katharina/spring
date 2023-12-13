package com.cydeo.cydeo.repository;

import com.cydeo.cydeo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    //3 methods
    //method --->sql -->>derive query  findByID(int id)

    //directly sql query  - @Query
    //JPQL - @Query
}
