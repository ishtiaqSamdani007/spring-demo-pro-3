package com.student.service;

import com.student.entity.Marks;

import java.util.List;

public interface MarksService {
    public List<Marks> findAll();

    public Marks findById(int id);

    public void save(Marks marks);
    public void deleteById(int id);

    List<Marks> findByStudentId(int id);
}
