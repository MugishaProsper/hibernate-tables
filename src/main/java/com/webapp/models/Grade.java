package com.webapp.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String section;

    @OneToMany(mappedBy = "grade", cascade = CascadeType.ALL)
    private List<Student> students;

    @OneToOne(mappedBy = "grade", cascade = CascadeType.ALL)
    private Classroom classroom;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getSection() {
        return section;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public Classroom getClassroom() {
        return classroom;
    }

}

