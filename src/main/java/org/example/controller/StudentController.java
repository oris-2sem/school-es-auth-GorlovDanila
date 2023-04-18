package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Student;
import org.example.service.StudentDataService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    private final StudentDataService studentDataService;

    @GetMapping
    public Iterable<Student> showStudents() {
        return studentDataService.findAll();
    }
}
