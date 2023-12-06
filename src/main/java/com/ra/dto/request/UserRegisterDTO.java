package com.ra.dto.request;

public class UserRegisterDTO {

    private String userName;
    private String email;
    private String phone;
    private String address;
    private String passWord;
    private  String role;

    public UserRegisterDTO() {
    }

    public UserRegisterDTO(String userName, String email, String phone, String address, String passWord, String role) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.passWord = passWord;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
