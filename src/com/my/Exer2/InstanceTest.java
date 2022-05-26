package com.my.Exer2;

/**
 * @ClassName: InstanceTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/13 11:28
 * @Version: v1.0
 **/
public class InstanceTest {

    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
//        test.method(new Student());
        test.method(new Person());
    }


    public void method(Person e) {
        if (e instanceof Person) {
            System.out.println("a person");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
    }
}

class Person {
    protected String name = "person";
    protected int age = 50;
    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age;
    }
}

class Student extends Person {
    protected String school = "pku";
    public String getInfo() {
        return "Name:" + name + "\nage:" + age + "\nschool:" + school;
    }
}

class Graduate extends Student {
    public String major = "IT";
    public String getInfo() {
        return "Name:" + name + "\nage:" + age + "\nschool:" + school + "\nmajor:" + major;
    }
}
