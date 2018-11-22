package com.example.practice1.model;

public class Student extends Department {
    private int studentNumber;
    private String studentName;
    private int grade;
    private String studentDept;
    private String email;
    private String studentAddress;
    private int age;
    private int studentState;

    public Student() {
    }

    public Student(int studentNumber, String studentName, int grade, String studentDept, String email, String studentAddress, int age, int studentState) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
        this.studentDept = studentDept;
        this.email = email;
        this.studentAddress = studentAddress;
        this.age = age;
        this.studentState = studentState;
    }

    public Student(int id, String name, String phoneNumber, String address, int dept_id, String dept_name, String dept_phoneNumber, int type, int studentNumber, String studentName, int grade, String studentDept, String email, String studentAddress, int age, int studentState) {
        super(id, name, phoneNumber, address, dept_id, dept_name, dept_phoneNumber, type);
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
        this.studentDept = studentDept;
        this.email = email;
        this.studentAddress = studentAddress;
        this.age = age;
        this.studentState = studentState;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentState() {
        return studentState;
    }

    public void setStudentState(int studentState) {
        this.studentState = studentState;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", grade=" + grade +
                ", studentDept='" + studentDept + '\'' +
                ", email='" + email + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", age=" + age +
                ", studentState=" + studentState +
                '}';
    }
}
