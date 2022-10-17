package com.example.group.artifact.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.group.artifact.domain.Student;
import com.example.group.artifact.services.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentResource {

    @Autowired 
    StudentService studentService;

    @PostMapping("/temp")
    public Student addStudent(@RequestBody Student student) {
        
        Student stud = studentService.addStudent(student);
        return stud;
    }
    
    public void authenticate() {
        // Authenticate auth
    }
    
    @GetMapping("")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    
    @GetMapping("/greet")
    public String getGreetings() {
        return "WELCOME";
    }

}
