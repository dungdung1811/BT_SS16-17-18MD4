package com.ra.model.entity;

public class CartItem {
    private int cartItemId;
    private int quantity;
    private double price;
    private User user;
    private Product product;
    public CartItem() {
    }

    public CartItem(int cartItemId, int quantity, double price, User user, Product product) {
        this.cartItemId = cartItemId;
        this.quantity = quantity;
        this.price = price;
        this.user = user;
        this.product = product;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
