package com.codegym.qlhs;

public class Student {
    private String name;
    private int age;

    public  Student(){};
    public  Student(String str, int i){
        this.name = str;
        this.age = i;
    };
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfomation(){
        System.out.printf("Student: %s\nAge: %d", this.getName(), this.getAge());
    }
}
