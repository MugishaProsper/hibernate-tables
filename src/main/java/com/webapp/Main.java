package com.webapp;

import com.webapp.models.*;
import com.webapp.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        EntityManager em = HibernateUtils.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Creating a Grade
        Grade grade = new Grade();
        grade.setName("Grade 10");
        grade.setSection("A");
        em.persist(grade);

        // Creating a Student
        Student student = new Student();
        student.setName("John Doe");
        student.setEmail("john@example.com");
        student.setDob(new java.util.Date());
        student.setGrade(grade);
        em.persist(student);

        // Creating a Teacher
        Teacher teacher = new Teacher();
        teacher.setName("Ms. Smith");
        teacher.setEmail("smith@example.com");
        teacher.setSubject("Math");
        em.persist(teacher);

        // Creating a Course
        Course course = new Course();
        course.setName("Algebra");
        course.setCredits(3);
        em.persist(course);

        // Enrolling Student
        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setDateEnrolled(new java.util.Date());
        em.persist(enrollment);

        tx.commit();
        em.close();
    }
}
