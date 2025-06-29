package com.springtest.students.model;

import java.time.LocalDate;
import java.time.Period;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Data    
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Column(unique = true)    
    private String email;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}
