package com.example.practice1.service.impl;

import com.example.practice1.model.Professor;
import com.example.practice1.model.builder.ProfessorBuilder;
import com.example.practice1.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

    private ProfessorBuilder professorBuilder = new ProfessorBuilder();

    @Override
    public Professor getByProfessorId(int id) {
        return professorBuilder
                .setProf_id(id)
                .build();
    }
}
