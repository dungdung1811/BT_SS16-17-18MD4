package com.ra.model.entity;

import java.util.List;

public class Category {
    private int categoryID;
    private String categoryName;
    private List<Product> products;

    public Category() {
    }

    public Category(int categoryID, String categoryName, List<Product> products) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.products = products;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
