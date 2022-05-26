package com.my.polyrph;

/**
 * @ClassName: Man
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/12 11:00
 * @Version: v1.0
 **/
public class Man extends Person{

    boolean isSmoking;

    int id = 1002;

    public void earnmoney() {
        System.out.println("赚钱");
    }

    public void eat() {
        System.out.println("多吃肉");
    }
    public void sleep() {
        System.out.println("经常熬夜");
    }

}
