package com.line.dao.domain;

public class User {
    private String id;
    private String name;
    private String password;

    public User() {
    }

    public User(String id, String user, String password) {
        this.id = id;
        this.name = user;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
