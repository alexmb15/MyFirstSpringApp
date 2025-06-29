package com.springtest.students.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springtest.students.model.Student;
import com.springtest.students.repository.InMemoryStudentDAO;
import com.springtest.students.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InMemoryStudentImpl implements StudentService {

    // This class will implement the methods defined in the StudentService interface
    // and provide an in-memory implementation for managing students.

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }  
    
    @Override
    public Student saveStudent(Student student) {
        // Logic to save the student in memory
        // For now, we will just return the student as is
        return repository.saveStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        // Logic to update the student in memory
        return repository.updateStudent(student);       
    }
    
    @Override
    public Student getStudentByEmail(String email) {    
        // Logic to retrieve a student by email
        // For now, we will return null as we are not storing students in memory
        return repository.getStudentByEmail(email);
    }

    @Override
    public void deleteStudentByEmail(String email) {
        // Logic to delete a student by email
        repository.deleteStudentByEmail(email);
    }

}
