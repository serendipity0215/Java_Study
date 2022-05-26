package com.my.Exer1;

/**
 * @ClassName: Account
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 11:44
 * @Version: v1.0
 **/
public class Account {

    private int id; // 账户
    private double balance; // 余额
    private double annuallnterestRate;  // 年利率

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    // 取钱
    /**
     * @desc    取钱的时候需要判断用户余额是否满足提款数额的要求，如果不能，应给出提示。
     * @param amount
     */
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足，取款失败！");
            return;
        }
        balance -= amount;
        System.out.println("成功取出：" + amount);
    }

    // 存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
