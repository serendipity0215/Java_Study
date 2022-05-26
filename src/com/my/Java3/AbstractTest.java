package com.my.Java3;

/**
 * @ClassName: AbstractTest
 * @Description: TODO
 *  abstract关键字的适用
 *      1. 抽象的
 *      2. 可以用来修饰的结构: 类、方法
 *
 *      3. abstract 修饰类: 抽象类
 *          > 此类不能实例化
 *          > 抽象类中一定有构造器，便于子类实例化时调用(涉及: 子类对象实例化的全过程)
 *          > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 *      4. abstract 修饰方法: 抽象方法
 *          > 抽象方法只有方法的声明，没有方法体
 *          > 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *          > 若子类重写了父类中的所有的抽象方法后，此子类方可实例化。
 *              若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，需要使用 abstract 修饰。
 *
 * @Author: ly-hulong3
 * @Date: 2022/5/25 8:52
 * @Version: v1.0
 **/
public class AbstractTest {

    public static void main(String[] args) {

        // Error:(25, 21) java: com.my.Java3.Person是抽象的; 无法实例化
//        Person p1 = new Person();
//        p1.eat();

        Student s1 = new Student("zozo", 1);
        s1.walk();
        System.out.printf(s1.getName());
    }
}

/**
 * 父类
 */
abstract class Person {
    String name;
    int age;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }
}


/**
 * 子类
 */
class Student extends Person {
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}