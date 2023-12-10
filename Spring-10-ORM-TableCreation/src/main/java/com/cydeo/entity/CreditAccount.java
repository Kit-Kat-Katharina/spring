package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
@Entity //creates table when we add this annotation
@Table(name = "creditAccount")//we can update name of the table over here
public class CreditAccount extends Account{
    BigDecimal creditLimit;
}
