package ClassandOject;

import java.util.Scanner;

public class area {

    public static void main(String args[]) {

        MyRectangle a1 = new MyRectangle();
        System.out.println("Area of rectangle : " + a1.area());

        MySquare a2 = new MySquare();
        System.out.println("Area of square : " + a2.area());

        // by passing arguments

        int length = 5, height = 5;

        MyTriangle a3 = new MyTriangle();
        System.out.println("Area of Triangle : " + a3.area(length, height));

        int radius = 5;
        
        MyCircle a4 = new MyCircle();
        System.out.println("Area of Circle : " + a4.area(radius));
    }
}

class MyRectangle {

    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int width = sc.nextInt();

    int area() {
        int a = length * width;
        return a;
    }
}

class MySquare {

    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();

    int area() {
        int a = length * length;
        return a;
    }
}

class MyTriangle {

    //with argument pasing 
    int area(int x, int y) {
        int a = (x * y) / 2;
        return a;
    }
}

class MyCircle {

    //with argument pasing 
    int area(int x) {
        int a = (x * x) * (22 / 7);
        return a;
    }
}
