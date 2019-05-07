package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDTO {

    private int orderId;
    private LocalDateTime orderTime;
    private Company company;
    private Product product;
    private int quantity;
    private BigDecimal pricePerPiece;
    private boolean isSold;

    public OrderDTO(int orderId, LocalDateTime orderTime, Company company, Product product, int quantity, BigDecimal pricePerPiece, boolean isSold) {
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.company = company;
        this.product = product;
        this.quantity = quantity;
        this.pricePerPiece = pricePerPiece;
        this.isSold = isSold;
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

    public boolean isSold() {
        return isSold;
    }
}
