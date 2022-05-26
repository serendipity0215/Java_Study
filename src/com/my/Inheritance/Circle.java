package com.my.Inheritance;

/**
 * @ClassName: Circle
 * @Description: 继承性的学习
 * @Author: ly-hulong3
 * @Date: 2022/5/10 11:16
 * @Version: v1.0
 **/
public class Circle {

    private double radius;  // 半径

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     */
    public double findArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
