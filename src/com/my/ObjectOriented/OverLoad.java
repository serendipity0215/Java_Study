package com.my.ObjectOriented;

/**
 * @ClassName: OverLoad
 * @Description: 在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可。
 * @Author: ly-hulong3
 * @Date: 2022/4/29 17:14
 * @Version: v1.0
 **/
public class OverLoad {

    public static void main(String[] args) {
        OverLoad test = new OverLoad();
        OverLoad test1 = new OverLoad();

        test.getSum(3,2);
        test1.getSum(3.1, 3.2);
        test.getShow("hulong", "dayi");
    }

    // getSum
    public void getSum(int x, int y){
        System.out.println(x + y);
    }

    public void getSum(double d1, double d2){
        System.out.println(d1 + d2);
    }

    public void getShow(String s1, String s2){
        System.out.println(s1 + ", " + s2);
    }

}
