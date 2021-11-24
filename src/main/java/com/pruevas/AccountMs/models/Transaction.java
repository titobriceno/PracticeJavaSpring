package com.pruevas.AccountMs.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Transaction {
    @Id
    private String id;
    private String userNameOrigin;
    private String userNameDestiny;
    private Date date;

    public Transaction(String id, String userNameOrigin, String userNameDestiny, Date date) {
        this.id = id;
        this.userNameOrigin = userNameOrigin;
        this.userNameDestiny = userNameDestiny;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getUserNameOrigin() {
        return userNameOrigin;
    }

    public void setUserNameOrigin(String userNameOrigin) {
        this.userNameOrigin = userNameOrigin;
    }

    public String getUserNameDestiny() {
        return userNameDestiny;
    }

    public void setUserNameDestiny(String userNameDestiny) {
        this.userNameDestiny = userNameDestiny;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
