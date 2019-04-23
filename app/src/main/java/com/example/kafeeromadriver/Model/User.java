package com.example.kafeeromadriver.Model;

public class User {
    private String Name;
    private String Password;
    private String Phone;
    private String IsStaff;





    public User(){}

    public User(String name, String password, String isStaff, String phone ) {
        Name = name;
        Password = password;
        Phone = phone;
        IsStaff = isStaff;


    }

    public String getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(String isStaff) {
        this.IsStaff = isStaff;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
