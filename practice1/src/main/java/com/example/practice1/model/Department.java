package com.example.practice1.model;

public class Department extends University {
    private int dept_id;
    private String dept_name;
    private String dept_phoneNumber;
    private int type;

    public Department() {

    }

    public Department(int dept_id, String dept_name, String dept_phoneNumber, int type) {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.dept_phoneNumber = dept_phoneNumber;
        this.type = type;
    }

    public Department(int id, String name, String phoneNumber, String address, int dept_id, String dept_name, String dept_phoneNumber, int type) {
        super(id, name, phoneNumber, address);
        this.dept_id = dept_id;
        this.dept_name = dept_name;
        this.dept_phoneNumber = dept_phoneNumber;
        this.type = type;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_phoneNumber() {
        return dept_phoneNumber;
    }

    public void setDept_phoneNumber(String dept_phoneNumber) {
        this.dept_phoneNumber = dept_phoneNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_phoneNumber='" + dept_phoneNumber + '\'' +
                ", type=" + type +
                '}';
    }
}
