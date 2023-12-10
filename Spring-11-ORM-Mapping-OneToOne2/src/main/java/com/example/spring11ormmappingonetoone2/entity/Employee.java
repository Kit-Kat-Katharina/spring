package com.example.spring11ormmappingonetoone2.entity;

import com.example.spring11ormmappingonetoone2.enums.Gender;
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

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="region_id")
    private Region region;
   @OneToOne(cascade = CascadeType.ALL)//we did join
  // @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
   @JoinColumn(name = "department_id")//name of the join(extra) column
   private Department department;
    public Employee(String firstName, String lastNAme, String email, LocalDate hireDate, int salary, Gender gender) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
