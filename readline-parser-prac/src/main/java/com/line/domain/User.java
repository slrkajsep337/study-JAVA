package com.line.domain;

public class User {
    public User() {
    }

    private String id;
    private String user;
    private String password;

    //constructor 생성
    public User(String id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }




}
