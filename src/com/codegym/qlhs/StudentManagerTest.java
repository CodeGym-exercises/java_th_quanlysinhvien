package com.codegym.qlhs;

import java.util.Scanner;

public class StudentManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        Student andy = new Student("Andy", 23);
        Student booby = new Student("Booby", 25);
        Student samy = new Student("Samy", 22);
        studentManager.addStudent(andy);
        studentManager.addStudent(booby);
        studentManager.addStudent(samy);
        studentManager.displayAll();
        studentManager.find("Andy");

    }

}
