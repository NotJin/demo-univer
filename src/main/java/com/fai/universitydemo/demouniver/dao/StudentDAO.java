package com.fai.universitydemo.demouniver.dao;

import com.fai.universitydemo.demouniver.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDAO implements IStudentDAO {

    private final EntityManager entityManager;
    @Autowired
    public StudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public List<Student> getStudents() {
        TypedQuery<Student> query = entityManager.createQuery("from Student", Student.class);
        List<Student> stds = query.getResultList();
        return stds;
    }

    @Override
    public Student getStudentById(Integer id) {
        return entityManager.find(Student.class,id);
    }
    @Override
    public Student saveStudent(Student student){
         entityManager.persist(student);
        return student;
    }
}
