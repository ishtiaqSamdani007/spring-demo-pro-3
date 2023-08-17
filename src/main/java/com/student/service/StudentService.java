package com.student.service;

import com.student.entity.Marks;
import com.student.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

    public Student findById(int id);

    public void addStudent(Student student);

    public void deleteStudent(int id);

}
