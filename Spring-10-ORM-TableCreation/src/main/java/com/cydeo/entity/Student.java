package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="students")
public class Student {
    @Id //if we want the field to be primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //if we want postgres t generate primary key for you - adding @GeneratedValue ect. annotation
    private Long id;
    @Column(name="studentFirstName") //change column names
    private String firstName;
    @Column(name="studentLastName")
    private String lastName;
    private String email;
    @Transient //this annotation is not going to bring it to table
    private String city;
    @Column(columnDefinition = "DATE") //if there is any date - use columnDefinition
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;
    @Enumerated(EnumType.STRING)//we need it for enums to be displayed as string not int(0-1)
    private Gender gender;
}
