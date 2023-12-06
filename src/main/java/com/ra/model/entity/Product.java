package com.ra.model.entity;

public class Product {
    private int productID;
    private String name;
    private String description;
    private double price;
    private boolean status;
    private int categoryID;
    private Category category;

    public Product() {
    }

    public Product(int productID, String name, String description, double price, boolean status, int categoryID, Category category) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.categoryID = categoryID;
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
