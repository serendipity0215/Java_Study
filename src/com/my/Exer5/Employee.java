package com.my.Exer5;

/**
 * @ClassName: Employee
 * @Description: TODO
 *  private 成员变量 name, number, birthday, 其中 birthday 为 MyDate 类的对象;
 *  abstract 方法 earnings();
 *  toString() 方法输出对象的 name, number 和 birthday
 * @Author: ly-hulong3
 * @Date: 2022/5/25 11:15
 * @Version: v1.0
 **/
public abstract class Employee {

    // 属性
    private String name;
    private int number;
    private MyDate birthday;

    // 构造器
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    // get、set方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    public MyDate getBirthday() {
        return birthday;
    }

    // 方法
    public abstract double earnings();

    // 方法

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday +
                '}';
    }
}
