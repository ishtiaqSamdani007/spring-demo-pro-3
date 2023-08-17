package com.student.dao;

import com.student.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarksRepository extends JpaRepository<Marks,Integer> {
    List<Marks> findByStudentId(int id);
}
