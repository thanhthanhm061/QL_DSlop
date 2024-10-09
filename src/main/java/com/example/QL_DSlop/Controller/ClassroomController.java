package com.example.QL_DSlop.Controller;

import com.example.QL_DSlop.Service.ClassroomService;
import com.example.QL_DSlop.models.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/api/classrooms")
    public List<Classroom> getAllClassrooms() {
        return classroomService.getAllClassrooms();
    }

    @PostMapping
    public Classroom createClassroom(@RequestBody Classroom classroom) {
        return classroomService.createClassroom(classroom);
    }

    @GetMapping("/{id}")
    public Classroom getClassroomById(@PathVariable Long id) {
        return classroomService.getClassroomById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable Long id) {
        classroomService.deleteClassroom(id);
    }
}