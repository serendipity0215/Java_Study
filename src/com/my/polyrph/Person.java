package com.my.polyrph;

/**
 * @ClassName: Person
 * @Description: 多态的学习
 * @Author: ly-hulong3
 * @Date: 2022/5/12 10:58
 * @Version: v1.0
 **/
public class Person {

    String name;
    int age;

    int id = 1001;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}
