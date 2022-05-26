package com.my.WrapperExer;

import java.util.concurrent.Callable;

/**
 * @ClassName: CircleTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/23 10:09
 * @Version: v1.0
 **/
public class CircleTest {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println("创建的圆的对象的个数为：" + Circle.getTotal());
    }
}

class Circle {

    private double radius;
    private int id;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    private static int total;   // 记录圆的个数
    private static int init = 1001; // static 声明的属性被所有的对象共享。

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}
