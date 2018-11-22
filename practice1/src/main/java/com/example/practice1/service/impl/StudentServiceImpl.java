package com.example.practice1.service.impl;

import com.example.practice1.model.Student;
import com.example.practice1.model.builder.StudentBuilder;
import com.example.practice1.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentBuilder studentBuilder = new StudentBuilder();

    @Override
    public Student getByStudentId(int id) {
        return studentBuilder
                .setStudentNumber(id)
                .build();
    }
}
