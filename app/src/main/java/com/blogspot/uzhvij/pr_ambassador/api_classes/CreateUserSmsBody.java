package com.blogspot.uzhvij.pr_ambassador.api_classes;

public class CreateUserSmsBody {

    private String phone = "636495501";

    public static CreateUserSmsBody getInstance() {
        return new CreateUserSmsBody();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
