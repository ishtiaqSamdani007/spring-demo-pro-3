package com.student.controller;

import com.student.entity.Marks;
import com.student.entity.Student;
import com.student.service.MarksService;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private MarksService marksService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/{studentId}/marks")
    public List<Marks> getAllMarksWithStudentId(@PathVariable int studentId){
        return marksService.findByStudentId(studentId);
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return studentService.findById(studentId);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        student.setId(0);
        studentService.addStudent(student);
        return student;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return student;
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
        return "deleted student with id - "+studentId;
    }

    @GetMapping("/marks")
    public List<Marks> getAllMarksList(){
        return marksService.findAll();
    }

    @GetMapping("/marks/{marksId}")
    public Marks getMarksById(@PathVariable int marksId){
        return marksService.findById(marksId);
    }

    @PostMapping("/marks")
    public Marks postMarks(@RequestBody Marks marks){
        marks.setId(0);
        marksService.save(marks);
        return marks;
    }

    @PutMapping("/marks")
    public Marks updateMarks(@RequestBody Marks marks){
        marksService.save(marks);
        return marks;
    }

    @DeleteMapping("/marks/{marksId}")
    public String deleteMark(@PathVariable int marksId){
        marksService.deleteById(marksId);
        return "deleted marks of id  - "+marksId;
    }
}
