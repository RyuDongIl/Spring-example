package com.example.practice1.model.builder;

import com.example.practice1.model.Professor;
import com.sun.javafx.font.PrismFontFactory;

public class ProfessorBuilder {
    private int prof_id;
    private String prof_name;
    private String dept;
    private String prof_phoneNumber;
    private String subject;

    public ProfessorBuilder setProf_id(final int prof_id) {
        this.prof_id = prof_id;
        return this;
    }

    public ProfessorBuilder setProf_name(final String prof_name) {
        this.prof_name = prof_name;
        return this;
    }

    public ProfessorBuilder setDept(final String dept) {
        this.dept = dept;
        return this;
    }

    public ProfessorBuilder setProf_phoneNumber(final String prof_phoneNumber) {
        this.prof_phoneNumber = prof_phoneNumber;
        return this;
    }

    public ProfessorBuilder setSubject(final String subject) {
        this.subject = subject;
        return this;
    }

    public Professor build() {
        return new Professor(this.prof_id, this.prof_name, this.dept, this.prof_phoneNumber, this.subject);
    }
}
