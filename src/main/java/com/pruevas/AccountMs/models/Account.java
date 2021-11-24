package com.pruevas.AccountMs.models;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private String userName;
    private Integer balance;
    private Date lastChange;

    public Account(String userName, Integer balance, Date lastChange) {
        this.userName = userName;
        this.balance = balance;
        this.lastChange = lastChange;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getBalance() {
        return balance;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }


}
