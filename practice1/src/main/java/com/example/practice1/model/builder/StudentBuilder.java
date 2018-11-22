package com.example.practice1.model.builder;

import com.example.practice1.model.Student;

public class StudentBuilder {
    private int studentNumber;
    private String studentName;
    private int grade;
    private String studentDept;
    private String email;
    private String studentAddress;
    private int age;
    private int studentState;

    public StudentBuilder setStudentNumber(final int studentNumber) {
        this.studentNumber = studentNumber;
        return this;
    }

    public StudentBuilder setStudentName(final String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setGrade(final int grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setStudentDept(final String studentDept) {
        this.studentDept = studentDept;
        return this;
    }

    public StudentBuilder setEmail(final String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setStudentAddress(final String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    public StudentBuilder setAge(final int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setStudentState(final int studentState) {
        this.studentState = studentState;
        return this;
    }

    public Student build() {
        return new Student(this.studentNumber, this.studentName, this.grade, this.studentDept, this.email, this.studentAddress, this.age, this.studentState);
    }
}
