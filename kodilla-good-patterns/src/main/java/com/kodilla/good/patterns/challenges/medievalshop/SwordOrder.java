package com.kodilla.good.patterns.challenges.medievalshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SwordOrder {

    public Order newOrderPlaced() {

        Client client = new Client("Geralt", "Riv", "witcher");
        Product product = new Product("Steel Sword - Wolf model", "Well-balanced, medium weight, extremely sharp, for humans only", new BigDecimal("1900"));
        LocalDateTime orderTime = LocalDateTime.of(2019, 05, 04, 16, 30);
        BigDecimal quantity = new BigDecimal("2");

        return new Order (client, product, orderTime, quantity);
    }

}
