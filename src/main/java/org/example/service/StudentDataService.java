package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class StudentDataService {

    private StudentRepository studentRepository;

    @Transactional
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

}
