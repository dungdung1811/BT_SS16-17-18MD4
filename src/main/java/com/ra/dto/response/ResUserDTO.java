package com.ra.dto.response;

public class ResUserDTO {
    private int userID;
    private String userName;
    private String email;
    private String phone;
    private String address;
    private  String role;

    public ResUserDTO() {
    }

    public ResUserDTO(int userID, String userName, String email, String phone, String address, String role) {

        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
