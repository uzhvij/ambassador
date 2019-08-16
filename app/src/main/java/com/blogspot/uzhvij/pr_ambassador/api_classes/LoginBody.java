package com.blogspot.uzhvij.pr_ambassador.api_classes;

public class LoginBody {
    private String email = "ivi5@gmail.com";
    private String password = "55555lff";

    public static LoginBody getInstance() {
        return new LoginBody();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
