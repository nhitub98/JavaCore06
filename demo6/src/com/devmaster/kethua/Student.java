package com.devmaster.kethua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private String clazz;

    public void nhap() {
        super.nhap();
            System.out.println("Nhap class");
            clazz = sc.nextLine();
    }
        public String xuat () {
            return super.xuat() + clazz;
        }
        public static void main (String[]args){
            List<Student> students = new ArrayList<>();
            for (int i=0;i<3;i++){
                Student student=new Student();
                student.nhap();
                students.add(student);
            }
            for(int i=0;i<3;i++){
                System.out.println(students.get(i).xuat());
            }
            System.out.println("Nhap class can tim:");
            String clazz=sc.nextLine();
            for(int i=0;i<3;i++){
                if(clazz.equals(students.get(i).getClass())){
                    System.out.println(students.get(i).xuat());
                }
            }
        }
    }

