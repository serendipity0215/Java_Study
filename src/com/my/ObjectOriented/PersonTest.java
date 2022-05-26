package com.my.ObjectOriented;

/*
*
* */

public class PersonTest {
    public static void main(String[] args) {

        // 创建类的对象
        Person p1 = new Person();

        // 调用对象的结构：属性、方法
        p1.name = "hulong";
        p1.age = 12;
        p1.isMale = true;

        p1.setAttr();
        p1.run();
    }
}


class Person{

    //  属性：对应类中的成员变量
    String name;
    int age = 1;
    boolean isMale;

    //  方法：对应类中的成员方法
    public void run(){
        System.out.println("可以跑步！");
    }

    public void setAttr(){
        System.out.println("名字：" + name + "\n年龄：" + age + "\n性别：" + isMale);
    }
}