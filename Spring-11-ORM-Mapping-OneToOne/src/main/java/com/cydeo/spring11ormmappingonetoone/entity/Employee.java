package com.cydeo.spring11ormmappingonetoone.entity;

import com.cydeo.spring11ormmappingonetoone.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="employee")
@NoArgsConstructor
@Data
public class Employee extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String firstName;
    private String lastNAme;
    private String email;
    @Column(columnDefinition = "DATE") //if there is any date - use columnDefinition
    private LocalDate hireDate;
   // private String department;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;
   // private int regionId;

    public Employee(String firstName, String lastNAme, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
