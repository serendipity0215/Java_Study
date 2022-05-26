package com.my.Exer1;

/**
 * @ClassName: Customer
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 11:44
 * @Version: v1.0
 **/
public class Customer {

    private String firstName;   // 姓
    private String lastName;    // 名
    private Account account;    // 账户

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
