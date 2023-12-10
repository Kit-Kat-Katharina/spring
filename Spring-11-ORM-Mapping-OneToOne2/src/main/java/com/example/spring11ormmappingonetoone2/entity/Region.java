package com.example.spring11ormmappingonetoone2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="regions")
@NoArgsConstructor
@Data
public class Region extends BaseEntity{
    private String region;
    private String country;

@OneToOne(mappedBy = "region")//create region column in EMPLOYEE
    private Employee employee;
    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }


}
