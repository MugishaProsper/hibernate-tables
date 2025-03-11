package com.webapp.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @ManyToOne
    @JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Date getDob() {
        return dob;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public Grade getGrade() {
        return grade;
    }
}

