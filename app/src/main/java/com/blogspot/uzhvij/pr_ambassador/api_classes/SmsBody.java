package com.blogspot.uzhvij.pr_ambassador.api_classes;

public class SmsBody {

    private String phone = "";

    public static SmsBody getInstance() {
        return new SmsBody();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
