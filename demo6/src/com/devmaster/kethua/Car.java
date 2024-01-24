package com.devmaster.kethua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle {
    private String speed;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap toc do");
        speed = sc.nextLine();
    }

    public String xuat() {
        return super.xuat() + speed;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap xe thu" + (i + 1) + ":");
            Car car=new Car();
            car.nhap();
            cars.add(car);
        }
        for(int i=0;i<n;i++){
            System.out.println(cars.get(i).xuat());
        }
    }
}
