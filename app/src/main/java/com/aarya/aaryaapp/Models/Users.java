package com.aarya.aaryaapp.Models;

public class Users {

    String e_mail, password, userID;

    public Users(String e_mail, String password, String userID) {
        this.e_mail = e_mail;
        this.password = password;
        this.userID = userID;
    }

    public Users(){}

    //Registration Constructor
    public Users(String e_mail, String password) {
        this.e_mail = e_mail;
        this.password = password;
    }

    public String getEmail() {
        return e_mail;
    }

    public void setEmail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
