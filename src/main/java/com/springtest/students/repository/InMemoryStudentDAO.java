package com.springtest.students.repository;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import com.springtest.students.model.Student;

@Repository
public class InMemoryStudentDAO {
    
    private List<Student> STUDENTS = new ArrayList<>();

    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        var existingStudent = IntStream.range(0, STUDENTS.size())
                .filter(i -> STUDENTS.get(i).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);         
        
        if (existingStudent > -1) {
            STUDENTS.set(existingStudent, student);
            return student;
        }

        return null;
    }

    public Student getStudentByEmail(String email) {
        return STUDENTS.stream()
                .filter(s -> s.getEmail().equals(email))
                .findFirst()                
                .orElse(null); // or throw an exception if not found
    }

    public void deleteStudentByEmail(String email) {
        var studentToDelete = getStudentByEmail(email);
        if (studentToDelete != null) {
            STUDENTS.remove(studentToDelete);
        }
    }
}
