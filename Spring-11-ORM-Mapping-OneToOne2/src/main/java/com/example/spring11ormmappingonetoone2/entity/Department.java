package com.example.spring11ormmappingonetoone2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity {
    private String department;
    private String division;
    @OneToOne(mappedBy = "department")//what kind of relationship we want to set up 1 employee to 1 department - CREATE DEPARTMENT IN EMPLOYEE
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
