package com.devmaster.kethua;

import lombok.Data;

import java.util.Scanner;

@Data
public class Vehicle {
    private String color;
    private String price;
    private String brand;
    private String name;
    static Scanner sc = new Scanner(System.in);
    void nhap() {
        System.out.println("Nhap color");
        color = sc.nextLine();
        System.out.println("Nhap price");
        price = sc.nextLine();
        System.out.println("Nhap brand");
        brand = sc.nextLine();
        System.out.println("Nhap name");
        name = sc.nextLine();
    }
    String xuat() {
            return "Vehicle{" +
                    "color='" + color + '\'' +
                    ", price='" + price + '\'' +
                    ", brand='" + brand + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

