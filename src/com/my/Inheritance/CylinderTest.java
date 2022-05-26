package com.my.Inheritance;

/**
 * @ClassName: CylinderTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/10 11:28
 * @Version: v1.0
 **/
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(5);

        double volume = cy.findVolume();
        System.out.println("圆柱体的体积为：" + volume);

        double area = cy.findArea();
        System.out.println("圆柱体的底面积为：" + area);
    }
}
