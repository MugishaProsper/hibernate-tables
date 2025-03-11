package com.webapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;
    private int capacity;

    @OneToOne
    @JoinColumn(name = "grade_id", nullable = false, unique = true)
    private Grade grade;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

