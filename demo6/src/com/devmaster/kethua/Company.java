package com.devmaster.kethua;

import lombok.Data;

import java.util.*;
@Data
public class Company {
    List<Employee> employees;
    int n;

    public Company() {
    }

    void nhap() {
        employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nhan vien:");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap nhan vien thu" + (i + 1) + ":");
            Employee employee = new Employee();
            employee.nhap();
            employees.add(employee);

        }
    }

    void xuat() {
        System.out.println("Danh sach nhan vien vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.println(employees.get(i).xuat());

        }
    }

    void sapXepLuong() {
        System.out.println("Sap xep theo luong giam dan");
        Collections.sort(employees, (b1, b2) -> Double.compare(b2.getSalary(), b1.getSalary()));
        for (Employee employee : employees) {
            System.out.println(employee.xuat());

        }
    }

    void sapXepTen() {
        System.out.println("Sap xep theo ten giam dan");
        Collections.sort(employees, (b1, b2) -> b2.getName().compareTo(b1.getName()));
        for (Employee employee : employees) {
            System.out.println(employee.xuat());
        }
    }

    void timKiemTen() {
        System.out.println("Nhap ten nhan vien can tim:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println("Nhan vien da tim thay:");
                System.out.println(employee.xuat());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien co ten " + name);
        }
    }
    void timLuongCaoNhat(){
        System.out.println("Nhan vien co luong cao nhat");
        Employee maxSalaryEmployee = Collections.max(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println(maxSalaryEmployee.xuat());
    }

        public static void main(String[] args) {
        Company company = new Company();
        company.nhap();
        company.xuat();
        company.sapXepLuong();
        company.sapXepTen();
        company.timKiemTen();
        company.timLuongCaoNhat();

    }
}