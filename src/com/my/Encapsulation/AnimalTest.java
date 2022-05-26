package com.my.Encapsulation;

/**
 * @ClassName: AnimalTest
 * @Description: 封装
 *      一、问题引入：
 *          1. 当我们创建一个类的对象以后，我们可以通过 "对象.属性" 的方式，对对象的属性进行赋值。这里，赋值操作要受到属性的数据类型和存储范围的制约。
 *             除此之外，没有其他制约条件。但是，在实绩问题中，我们往往需要给属性赋值加入额外的限制条件。这个条件就不能在属性声明时体现，我们职能通过方法进行限制条件的添加。
 *             同时，我们需要避免用户在使用 "对象.属性" 的方式对属性进行赋值。则需要将属性声明为私有的。
 *
*       二、封装的体现：
 *          1. 将类的属性私有化，同时，提供公共的方法来获取和设置此属性的值。
 *
 *      三、封装性的体现，需要权限修饰符来配合。
 *          1. Java规定的四种权限(从小到大排列)：private、default(缺省)、protected、public
 *          2. 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *          3. 具体的 4种 权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *              -- 修饰类的话，只能用 default 或者 public
 * @Author: ly-hulong3
 * @Date: 2022/5/5 8:33
 * @Version: v1.0
 **/
public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "dayi";
        a.age = 12;
//        a.legs = 4;

        a.setLegs(-4);
        System.out.println(a.getLegs());
        a.show();
    }
}

class Animal {

    String name;
    int age;
    private int legs;   //  私有化，禁用外部输入

    //  对于属性的设置
    public void setLegs(int legs) {
        if (legs >=0 && legs % 2 ==0) {
            this.legs = legs;
        }else {
            legs = 0;
        }
    }

    //  对于属性的获取
    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("吃");
    }

    public void show() {
        System.out.println(name + "," + age + "," + legs);
    }
}
