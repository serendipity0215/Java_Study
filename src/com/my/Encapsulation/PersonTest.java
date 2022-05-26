package com.my.Encapsulation;

/**
 * @ClassName: PersonTest
 * @Description: 构造器 constructor
 *
 *      类的结构之三：构造器
 *          1. 构造器的作用：
 *              ① 创建对象
*           2. 说 明：
 *              ① 如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 *              ② 定义构造器的格式：权限修饰符 类名(形参列表){}
 *              ③ 一个类中定义的多个构造器，彼此构成重载
 *              ④ 一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 *              ⑤ 一个类中，至少会有一个构造器
 *
 * @Author: ly-hulong3
 * @Date: 2022/5/5 14:49
 * @Version: v1.0
 **/
public class PersonTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.eat();

    }
}

class Person {
    // 属性
    String name;
    int age;

    // 构造器


    // 方法
    public void eat() {
        System.out.println("renchifan");;
    }
}
