package com.my.Exer3;

/**
 * @ClassName: EmployeeTest
 * @Description: TODO
 *  使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。
 * @Author: ly-hulong3
 * @Date: 2022/5/25 9:50
 * @Version: v1.0
 **/
public class EmployeeTest {

    public static void main(String[] args) {

        Manager m1 = new Manager("zozo", 1001, 3000000, 20000);
        m1.work();

        System.out.println();
        CommonEmployee c1 = new CommonEmployee();
        c1.work();

    }
}
