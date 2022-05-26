package com.my.Encapsulation;

/**
 * @ClassName: ThisTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 10:42
 * @Version: v1.0
 **/
public class ThisTest {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setName("hul");
        boy.setAge(30);
        boy.shout();

        Girl girl = new Girl();
        girl.setName("zozo");
        girl.setAge(22);
        girl.marry(boy);
    }
}

class Boy {

    // 属性
    private String name;
    private int age;

    // 构造
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

    // fangfa
    public void marry(Girl girl) {
        System.out.println(this.name + "想娶：" + girl.getName());
    }
    public void shout() {
        if (this.age >= 22) {
            System.out.println("你可以登记结婚了！");
        }else {
            System.out.println("你可以先尝试先多谈谈恋爱~~");
        }
    }
}

class Girl {
    // 属性
    private String name;
    private int age;
    // 构造
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
    // 方法
    public void marry(Boy boy) {
        System.out.println(this.name + "我想嫁给：" + boy.getName());
        boy.marry(this);
    }

    /**
     *
     * @param girl
     * @return  正数：当前对象大； 负数：当前对象小； 0：相同
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        }else if (this.age < girl.age) {
            return -1;
        }else {
            return 0;
        }
    }
}
