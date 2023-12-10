package com.cydeo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.math.BigDecimal;

@MappedSuperclass
//we not going to create any table from this class, this class responsibility is : inherit all the fields to the extending classes
public class Account {
    @Id //means -this is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //we are letting postgres provide the id(it generates it), if we don't add this annotation, we will have to provide it ourselves
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
