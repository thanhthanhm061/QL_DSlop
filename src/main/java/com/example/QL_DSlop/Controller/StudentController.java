package com.example.QL_DSlop.Controller;

import com.example.QL_DSlop.Service.StudentService;
import com.example.QL_DSlop.models.Studen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Studen> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Studen createStudent(@RequestBody Studen student) {
        return studentService.createStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
