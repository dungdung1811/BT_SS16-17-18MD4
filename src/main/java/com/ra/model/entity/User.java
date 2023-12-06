package com.ra.model.entity;

import java.util.List;

public class User {
    private int userID;
    private String userName;
    private String email;
    private String passWord;
    private String phone;
    private String address;
    private List<Order> order;
    private  String role;
    private  List<CartItem> cartItems;

    public User() {
    }

    public User(int userID, String userName, String email, String passWord, String phone, String address, List<Order> order, String role, List<CartItem> cartItems) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.phone = phone;
        this.address = address;
        this.order = order;
        this.role = role;
        this.cartItems = cartItems;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
