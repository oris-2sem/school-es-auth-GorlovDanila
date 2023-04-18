package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Teacher;
import org.example.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class TeacherDataService {

    private TeacherRepository teacherRepository;

    @Transactional
    public Iterable<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}
