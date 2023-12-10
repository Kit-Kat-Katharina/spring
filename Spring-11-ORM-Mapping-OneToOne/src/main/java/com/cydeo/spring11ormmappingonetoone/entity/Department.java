package com.cydeo.spring11ormmappingonetoone.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="department")
@NoArgsConstructor
@Data
public class Department extends BaseEntity{
    private String department;
    private String division;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
