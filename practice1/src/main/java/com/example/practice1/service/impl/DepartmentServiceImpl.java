package com.example.practice1.service.impl;

import com.example.practice1.model.Department;
import com.example.practice1.model.builder.DepartmentBuilder;
import com.example.practice1.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentBuilder departmentBuilder = new DepartmentBuilder();

    @Override
    public Department getByDepartmentId(int id) {
        return departmentBuilder
                .setDept_id(id)
                .build();
    }
}
