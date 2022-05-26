package com.my.Exer3;

/**
 * @ClassName: Employee
 * @Description: TODO
 *  编写一个Employee类，声明为抽象类。
 *  包含如下三个属性: name, id, salary
 *  提供必要的构造器和抽象方法: work()
 *
 * @Author: ly-hulong3
 * @Date: 2022/5/25 9:39
 * @Version: v1.0
 **/
public abstract class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee() {
    }
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

}
