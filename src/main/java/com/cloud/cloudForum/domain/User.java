package com.cloud.cloudForum.domain;

public class User {
    private int id;
    private String email;
    private String name;
    private String password;
    private int sex;

    public int getId() {
        return id;
    }

    public User() {};

    public User(int id, String email, String userName, String password, int sex) {
        this.id = id;
        this.email = email;
        this.name = userName;
        this.password = password;
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                '}';
    }
}
