package com.example.practice1.model;

public class Professor extends Department {
    private int prof_id;
    private String prof_name;
    private String dept;
    private String prof_phoneNumber;
    private String subject;

    public Professor() {
    }

    public Professor(int prof_id, String prof_name, String dept, String prof_phoneNumber, String subject) {
        this.prof_id = prof_id;
        this.prof_name = prof_name;
        this.dept = dept;
        this.prof_phoneNumber = prof_phoneNumber;
        this.subject = subject;
    }

    public Professor(int id, String name, String phoneNumber, String address, int dept_id, String dept_name, String dept_phoneNumber, int type, int prof_id, String prof_name, String dept, String prof_phoneNumber, String subject) {
        super(id, name, phoneNumber, address, dept_id, dept_name, dept_phoneNumber, type);
        this.prof_id = prof_id;
        this.prof_name = prof_name;
        this.dept = dept;
        this.prof_phoneNumber = prof_phoneNumber;
        this.subject = subject;
    }

    public int getProf_id() {
        return prof_id;
    }

    public void setProf_id(int prof_id) {
        this.prof_id = prof_id;
    }

    public String getProf_name() {
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getProf_phoneNumber() {
        return prof_phoneNumber;
    }

    public void setProf_phoneNumber(String prof_phoneNumber) {
        this.prof_phoneNumber = prof_phoneNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "prof_id=" + prof_id +
                ", prof_name='" + prof_name + '\'' +
                ", dept='" + dept + '\'' +
                ", prof_phoneNumber='" + prof_phoneNumber + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
