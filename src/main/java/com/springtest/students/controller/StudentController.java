package com.springtest.students.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.springtest.students.service.StudentService;

import lombok.AllArgsConstructor;

import com.springtest.students.model.Student;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(params = "email")          
    public Student getStudentByEmail(@RequestParam String email) {
        return studentService.getStudentByEmail(email);
    }

    @GetMapping("{email}")
    public Student getStudentByEmailPath(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }
 
    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }  

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    } 
    
    @DeleteMapping(value = "/delete_student", params = "email")
    public void deleteStudentByEmail(@RequestParam String email) {
        studentService.deleteStudentByEmail(email);
    }

    @DeleteMapping("/delete_student/{email}")
    public void deleteStudentByEmailPath(@PathVariable String email) {
        studentService.deleteStudentByEmail(email);
    }

}
