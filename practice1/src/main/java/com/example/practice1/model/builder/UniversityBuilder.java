package com.example.practice1.model.builder;

import com.example.practice1.model.University;

public class UniversityBuilder {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;

    public UniversityBuilder setId(final int id) {
        this.id = id;
        return this;
    }

    public UniversityBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public UniversityBuilder setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UniversityBuilder setAddress(final String address) {
        this.address = address;
        return this;
    }

    public University build() {
        return new University(this.id, this.name, this.phoneNumber, this.address);
    }
}
