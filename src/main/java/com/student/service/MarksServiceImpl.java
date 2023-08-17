package com.student.service;

import com.student.dao.MarksRepository;
import com.student.entity.Marks;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksServiceImpl implements MarksService{
    @Autowired
    private MarksRepository marksRepository;
    @Override
    @Transactional
    public List<Marks> findAll() {
        return marksRepository.findAll();
    }

    @Override
    @Transactional
    public Marks findById(int id) {
        return marksRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void save(Marks marks) {
        marksRepository.save(marks);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        marksRepository.deleteById(id);
    }

    @Override
    public List<Marks> findByStudentId(int id) {
        return marksRepository.findByStudentId(id);
    }
}
