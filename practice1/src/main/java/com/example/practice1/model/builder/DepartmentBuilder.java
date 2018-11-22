package com.example.practice1.model.builder;

import com.example.practice1.model.Department;

public class DepartmentBuilder extends UniversityBuilder {
    private int dept_id;
    private String dept_name;
    private String dept_phoneNumber;
    private int type;

    public DepartmentBuilder setDept_id(final int dept_id) {
        this.dept_id = dept_id;
        return this;
    }

    public DepartmentBuilder setDept_name(final String dept_name) {
        this.dept_name = dept_name;
        return this;
    }

    public DepartmentBuilder setDept_phoneNumber(final String dept_phoneNumber) {
        this.dept_phoneNumber = dept_phoneNumber;
        return this;
    }

    public DepartmentBuilder setType(final int type) {
        this.type = type;
        return this;
    }

    public Department build() {
        return new Department(this.dept_id, this.dept_name, this.dept_phoneNumber, this.type);
    }
}
