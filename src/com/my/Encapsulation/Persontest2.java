package com.my.Encapsulation;

/**
 * @ClassName: Persontest2
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 9:06
 * @Version: v1.0
 **/
public class Persontest2 {
    public static void main(String[] args) {
        Person2 per2 = new Person2("hulong");
        per2.getInfo();
        System.out.println(per2.getInfo());

    }

}

class Person2 {

    private String name;
    private int age;

    // 无参构造器
    public Person2() {
        System.out.println("新对象实例化");
    }
    // 调用本类总的无参构造器
    public Person2(String name) {
        this();
        this.name = name;
    }
    // 调用一个有参数的构造器
    public Person2(String name, int age) {
        this(name);
        this.age = age;
    }
    public String getInfo() {
        return "姓名：" + name + ", 年龄：" + age;
    }

}
