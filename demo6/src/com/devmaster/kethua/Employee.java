package com.devmaster.kethua;

import lombok.Data;

@Data
public class Employee extends Person {
    private Double salary;
    private String position;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap salary");
        salary = Double.valueOf(sc.nextLine());
        System.out.println("Nhap position");
        position = sc.nextLine();
    }

    public String xuat() {
        return super.xuat() + salary + position;
    }

    public static void main(String[] args) {
    }


}



