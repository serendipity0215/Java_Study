package com.my.Exer6;

/**
 * @ClassName: Circle
 * @Description: 定义一个 Circle 类, 声明 radius 属性, 提供 getter 和 setter 方法
 * @Author: ly-hulong3
 * @Date: 2022/5/26 14:06
 * @Version: v1.0
 **/
public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
}
