package com.blogspot.uzhvij.pr_ambassador.api_classes;

public class RegistrationBody {

    private String firstname = "Ivan";
    private String lastname = "Ivanov";
    private String email = "wwwuzhvij@ukr.net";
    private String password = "ytttttttt";
    private String phone = "www+380636495501";
    private String lat = "";
    private String lng = "";
    private String imei = "www35-419002-389644-3";

    public static RegistrationBody getInstance() {
        return new RegistrationBody();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
