package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

    private int orderId;
    private LocalDateTime orderTime;
    private Company company;
    private Product product;
    private int quantity;
    private BigDecimal pricePerPiece;

    public Order(int orderId, LocalDateTime orderTime, Company company, Product product, int quantity, BigDecimal pricePerPiece) {
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.company = company;
        this.product = product;
        this.quantity = quantity;
        this.pricePerPiece = pricePerPiece;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Company getCompany() {
        return company;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPricePerPiece() {
        return pricePerPiece;
    }
}
