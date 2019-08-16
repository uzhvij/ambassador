package com.blogspot.uzhvij.pr_ambassador;

class User {
    private static final User instance = new User();
    private String phoneNumber;

    private User() {
    }

    static User getInstance() {
        return instance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
