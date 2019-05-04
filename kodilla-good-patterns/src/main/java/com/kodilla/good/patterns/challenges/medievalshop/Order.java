package com.kodilla.good.patterns.challenges.medievalshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

    private Client client;
    private Product product;
    private LocalDateTime timeOfOrder;
    private BigDecimal quantity;

    public Order(Client client, Product product, LocalDateTime timeOfOrder, BigDecimal quantity) {
        this.client = client;
        this.product = product;
        this.timeOfOrder = timeOfOrder;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}
