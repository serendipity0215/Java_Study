package com.my.polyrph;

/**
 * @ClassName: PersonTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/12 11:03
 * @Version: v1.0
 **/
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "AA";
//        System.out.println(" 的吃饭习惯：" + p1.eat() + ", 的睡觉习惯：" + p1.sleep());
        p1.eat();
        p1.sleep();
        System.out.println();

        Person p2 = new Man();
        p2.name = "hulong";
        p2.eat();
        p2.sleep();
        /**
         * 如何才能调用子类特有的属性和方法？
         * 向下转型：使用强制类型转换符。
         *
         * @注意事项：   使用强转时，可能出现ClassCastException的异常。
         *
         * instanceof关键字的使用：
         *  a instanceof A：判断对象 a 是否是类 A 的实例。如果是，返回true；如果不是，返回false
         *
         *  使用情境：
         *      为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         */
        Man m1 = (Man)p2;
        m1.earnmoney();
        m1.isSmoking = true;
        System.out.println();

        Woman p3 = new Woman();
        p3.name = "zozo";
        p3.isBeauty = true;
        p3.eat();
        p3.sleep();
        p3.goShopping();

    }
}
