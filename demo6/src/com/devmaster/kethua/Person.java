package com.devmaster.kethua;

import lombok.Data;

import java.util.Scanner;

@Data //k can go get set constructor
public class Person {
    private String name;
    private String age;
    private String address;
    static Scanner sc = new Scanner(System.in);

    void nhap() {
            System.out.println("Nhap name");
            name = sc.nextLine();
            System.out.println("Nhap age");
            age = sc.nextLine();
            System.out.println("Nhap address");
            address = sc.nextLine();
    }
        String xuat() {
            return name + "-" + age + "-" + address;
        }
    }

