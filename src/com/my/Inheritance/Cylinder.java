package com.my.Inheritance;

/**
 * @ClassName: Cylinder
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/10 11:25
 * @Version: v1.0
 **/
public class Cylinder extends Circle {

    private double length;  // 圆柱体的高

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 计算圆柱体体积
     */
    public double findVolume() {
        return findArea() * getLength();
    }
}
