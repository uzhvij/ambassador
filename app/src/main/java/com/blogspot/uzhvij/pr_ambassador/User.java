package com.blogspot.uzhvij.pr_ambassador;

public class User {
    private static final User instance = new User();
    private String phoneNumber;
    private String password;

    private User() {
    }

    public static User getInstance() {
        return instance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
