package com.mikovic.service;

import com.mikovic.models.Student;
import com.mikovic.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public Student getStudentById(int id) {
        // Optional<Student> studentOp = Optional.of(studentsRepository.findOneById(id));
        Student student = studentsRepository.findOneById(id);
        return student;
    }

    public StudentsService() {

    }
}