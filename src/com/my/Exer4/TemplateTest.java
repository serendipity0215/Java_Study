package com.my.Exer4;

/**
 * @ClassName: TemplateTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/25 10:22
 * @Version: v1.0
 **/
public class TemplateTest {

    public static void main(String[] args) {
        Template t1 = new SubTemplate();
        t1.code();
        t1.spendTime();
    }

}

abstract class Template {
    public void spendTime() {
        long startTime = System.currentTimeMillis();

        code(); // 不确定的部分
        System.out.println();
        long endTime = System.currentTimeMillis();

        System.out.println("花费的时间为: " + (endTime - startTime));
    }

    public abstract void code();
}

class SubTemplate extends Template {

    @Override
    public void code() {
        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }if(isFlag) {
                System.out.print(i + ", ");
            }
        }
    }
}
