package com.fai.universitydemo.demouniver.controller;

import com.fai.universitydemo.demouniver.dao.StudentDAO;
import com.fai.universitydemo.demouniver.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {
    private final StudentDAO studentDAO;
    public StudentController(StudentDAO studentDAO){

        this.studentDAO = studentDAO;
    }
    @GetMapping("/getstudent")
    public List<Student> GetStudents(){
        System.out.println("Get");
        return studentDAO.getStudents();
    }
    @GetMapping("/getStudentById{id}")
    public Student GetStudentById(@PathVariable Integer id){
        return studentDAO.getStudentById(id);
    }
}
