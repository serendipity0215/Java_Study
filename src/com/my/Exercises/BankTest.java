package com.my.Exercises;

/**
 * @ClassName: BankTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 16:14
 * @Version: v1.0
 **/
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("hu", "long");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + " 的账户余额为：" + balance);

        System.out.println("========================================================");

        bank.addCustomer("zo", "zo");
        bank.getCustomer(1).setAccount(new Account(1000));
        bank.getCustomer(1).getAccount().withdraw(1001);
        double balance1 = bank.getCustomer(1).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + " 的账户余额为：" + balance1);
    }
}
