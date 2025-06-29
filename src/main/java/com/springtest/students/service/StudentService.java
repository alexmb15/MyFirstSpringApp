package com.springtest.students.service;

import java.util.List;

import com.springtest.students.model.Student;

public interface StudentService {    

    List<Student> getAllStudents();    

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    Student getStudentByEmail(String email);    
    
    void deleteStudentByEmail(String email);

}
