package com.my.Exer1;

/**
 * @ClassName: Exer1Test
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 12:02
 * @Version: v1.0
 **/
public class Exer1Test {
    public static void main(String[] args) {

        // 创建一个 Customer ，名字叫 Jane Smith
        Customer cust = new Customer("zozo", "hul");

        // 他有一个账号为 1000，余额为 2000 元，年利率为 1.23％ 的账户
        Account acct = new Account(1000, 2000, 0.0123);

        // 操作：存入 100 元，再取出 960 元。再取出 2000 元。
        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("Customer [" + cust.getLastName() + ", " + cust.getFirstName() + "] has a account: id is " + cust.getAccount().getId() +
    ", annuallnterestRate is " + cust.getAccount().getAnnuallnterestRate() * 100 + "%, balance is " + cust.getAccount().getBalance());
    }
}
