package com.example.practice1;

import com.example.practice1.model.Department;
import com.example.practice1.model.Professor;
import com.example.practice1.model.Student;
import com.example.practice1.model.University;
import com.example.practice1.model.builder.DepartmentBuilder;
import com.example.practice1.model.builder.ProfessorBuilder;
import com.example.practice1.model.builder.StudentBuilder;
import com.example.practice1.model.builder.UniversityBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final ArrayList<University> univList = new ArrayList<>();
        final ArrayList<Department> deptList = new ArrayList<>();
        final ArrayList<Professor> profList = new ArrayList<>();
        final ArrayList<Student> studentList = new ArrayList<>();

//        final UniversityBuilder universityBuilder = new UniversityBuilder();
//        final DepartmentBuilder departmentBuilder = new DepartmentBuilder();
//        final ProfessorBuilder professorBuilder = new ProfessorBuilder();
//        final StudentBuilder studentBuilder = new StudentBuilder();

        for(int i = 0; i < 3; i++) {
            studentList.add(new Student());
            univList.add(new University());
            deptList.add(new Department());
            profList.add(new Professor());
        }

        for(final University u : univList) {
            System.out.println(u.toString());
        }

        for(final Student s : studentList) {
            System.out.println(s.toString());
        }

        for(final Department d : deptList) {
            System.out.println(d.toString());
        }

        for(final Professor p : profList) {
            System.out.println(p.toString());
        }
    }
}
