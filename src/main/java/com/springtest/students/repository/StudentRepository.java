package com.springtest.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springtest.students.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentByEmail(String email);
    Student getStudentByEmail(String email);
}
