package com.my.ObjectOriented;

/*
*   关于权限修饰符：
*       Java规定的4种权限修饰符：private、public、缺省、protected
*
*   返回值类型：有返回值 vs 没有返回值
*       如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中，需要使用return关键字来返回指定类型的变量或常量。
*       如果方法没有返回值，则方法声明时，使用void来表示。
*
* */

import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入圆的半径：（保留两位有效小数 00.00）");

        double sc1 = sc.nextDouble();
        c1.radius = sc1;

        double area = c1.findArea();
        System.out.println("半径为：" + c1.radius + ", 对应的圆的面积为：" + area);

    }
}

class Circle{

    //  属性
    double radius;

    //  方法：求圆的面积
    public double findArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

}


