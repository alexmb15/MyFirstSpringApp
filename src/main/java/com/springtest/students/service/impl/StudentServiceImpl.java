package com.springtest.students.service.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.springtest.students.model.Student;
import com.springtest.students.repository.StudentRepository;
import com.springtest.students.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public void deleteStudentByEmail(String email) {               
        studentRepository.deleteStudentByEmail(email);
    }

    @Override
    public List<Student> getAllStudents() {       
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByEmail(String email) {        
        return studentRepository.getStudentByEmail(email);
    }

    @Override
    public Student saveStudent(Student student) {        
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {        
        return studentRepository.save(student);
    }

    

}
