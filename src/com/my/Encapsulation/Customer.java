package com.my.Encapsulation;

/**
 * @ClassName: Customer
 * @Description: JavaBean是一种Java语言写成的可重用组件。
 *      1. 类是公共的
 *      2. 有一个无参的公共的构造器
 *      3. 有属性，且有对应的get、set方法
 * @Author: ly-hulong3
 * @Date: 2022/5/6 8:28
 * @Version: v1.0
 **/
public class Customer {

    private int id;
    private String name;

    public Customer() {

    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
