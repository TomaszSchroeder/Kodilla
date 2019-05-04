package com.kodilla.good.patterns.challenges.medievalshop;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private String description;
    private BigDecimal price;

    public Product(String productName, String description, BigDecimal price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
