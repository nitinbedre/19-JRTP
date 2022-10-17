package com.example.group.artifact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.group.artifact.domain.Student;
import com.example.group.artifact.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student) {
        Student stud = studentRepository.save(student);
        return stud;
    }

    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        return studentRepository.findAll();
    }

}
