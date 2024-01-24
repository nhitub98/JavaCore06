package com.devmaster.kethua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Truck extends Vehicle{
    public String truckload;
    public void nhap() {
        super.nhap();
        System.out.println("Nhap truckload");
        truckload = sc.nextLine();
    }

    public String xuat() {
        return super.xuat() + truckload;
    }

    public static void main(String[] args) {
        List<Truck> trucks  = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap xe thu" + (i + 1) + ":");
            Truck truck=new Truck();
            truck.nhap();
            trucks.add(truck);
        }
        for(int i=0;i<n;i++){
            System.out.println(trucks.get(i).xuat());
        }
    }
}
