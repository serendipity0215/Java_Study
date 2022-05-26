package com.my.Encapsulation;

import sun.security.mscapi.CPublicKey;

/**
 * @ClassName: PersonTest1
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 8:53
 * @Version: v1.0
 **/
public class PersonTest1 {
    public static void main(String[] args) {
        Person1 per1 = new Person1("zhangsan");
        Person1 per2 = new Person1("lisi");
        per1.getInfo();
        per2.getInfo();
        boolean b = per1.compare(per2);
    }
}

class Person1 {
    String name;
    Person1(String name) {
        this.name = name;
    }
    public void getInfo() {
        System.out.println("Person类：" + this.name);
    }
    public boolean compare(Person1 p) {
        return this.name == p.name;
    }

}
