package com.example.practice1.service.impl;

import com.example.practice1.model.University;
import com.example.practice1.model.builder.UniversityBuilder;
import com.example.practice1.service.UniversityService;

public class UniversityServcieImpl implements UniversityService {

    private UniversityBuilder universityBuilder = new UniversityBuilder();

    @Override
    public University getByUniversityId(int id) {
        return universityBuilder
                .setId(id)
                .build();
    }
}
