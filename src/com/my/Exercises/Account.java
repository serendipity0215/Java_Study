package com.my.Exercises;

/**
 * @ClassName: Accounr
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 15:51
 * @Version: v1.0
 **/
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // 存钱
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("成功存入：" + amt);
        }
    }

    // 取钱
    public void withdraw(double amt) {
        if (amt < balance) {
            balance -= amt;
            System.out.println("成功取出：" + amt);
        }else {
            System.out.println("余额不足，取款失败");
            return;
        }
    }
}
