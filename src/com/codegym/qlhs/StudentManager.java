package com.codegym.qlhs;

import java.util.ArrayList;

public class StudentManager {
    private int size;
    private Student[] studentList = new Student[20];

    public StudentManager(){
        this.size = 0;
    }

    public void addStudent(Student student){
        studentList[this.size] = student;
        this.size++;
    }

    public void find(String str){
        boolean found = false;
        for(int i = 0; i < this.studentList.length; i++){
            if(this.studentList[i].getName().equals(str)){
                System.out.printf("\nDa tim thay %s tai vi tri %d!! ",str,i);
                found = true;
                break;
            }
        }
        if(found=false){
            System.out.printf("Khong the tim thay %s trong danh sach !! ",str);
        }

    }

    public void displayAll(){
        System.out.printf("Danh sach sinh vien: \n");
        for(int i = 0; i < this.size; i++){
            System.out.printf("\nSinh vien %d: \n",i);
            this.studentList[i].getInfomation();
        }
    }
}
