package com.kodilla.good.patterns.challenges.medievalshop;

public class OrderDTO {

    private Client client;
    private Product product;
    boolean isSold;

    public OrderDTO(Client client, Product product, boolean isSold) {
        this.client = client;
        this.product = product;
        this.isSold = isSold;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return isSold;
    }
}
