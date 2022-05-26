package com.my.Exer2;

/**
 * @ClassName: GeometricTest
 * @Description: 练习题
 *  定义三个类，父类
 * @Author: ly-hulong3
 * @Date: 2022/5/13 11:54
 * @Version: v1.0
 **/
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle(2.2, "red", 1.2);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle(2.2, "red", 1.1);
//        System.out.println("c2圆的面积为：" + c2.findArea());
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println("c1 和 c2的面积是否相等：" + isEquals);
        MyRectangle rect = new MyRectangle(2, 4, "white", 1.2);
        test.displayGeometricObject(rect);

    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g) {
        System.out.println("对象的面积为：" + g.findArea());
    }
}


class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}