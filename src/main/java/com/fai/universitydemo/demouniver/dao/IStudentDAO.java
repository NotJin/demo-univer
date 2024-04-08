package com.fai.universitydemo.demouniver.dao;

import com.fai.universitydemo.demouniver.entity.Student;

import java.util.List;

public interface IStudentDAO {
    void save(Student student);
    List<Student> getStudents();
    Student getStudentById(Integer id);

    Student saveStudent(Student student);
}
