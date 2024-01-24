package com.devmaster;

public class Demo {
    static int a = 0; // biến này khởi tạo khi khởi tạo class
    int b = 0; //sẽ được khởi tạo lại mỗi lần khởi tạo class

    public static String display() { //có thể gọi lại ở hàm main k cần tên class
        return "hello";
    }

//    public String display() { //có thể gọi lại ở hàm main k cần tên class
//    }


    public static void main(String[] args) {
        Demo demo  = new Demo();
        demo.a++;
        demo.b++;
        System.out.println("a:"+(demo.a));
        System.out.println("b:"+(demo.b));
        Demo demo1  = new Demo();
        demo.a++;
        demo.b++;
        System.out.println("a:"+(demo1.a));
        System.out.println("b:"+(demo1.b));
        display(); //dùng static
        demo.display(); //nếu k dùng static
    }
}
