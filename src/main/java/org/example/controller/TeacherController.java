package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Teacher;
import org.example.service.TeacherDataService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    private final TeacherDataService teacherDataService;

    @GetMapping
    public Iterable<Teacher> showTeachers() {
        return teacherDataService.findAll();
    }
}
