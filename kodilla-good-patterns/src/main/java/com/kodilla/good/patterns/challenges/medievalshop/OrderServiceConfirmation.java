package com.kodilla.good.patterns.challenges.medievalshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderServiceConfirmation implements OrderService {



    @Override
    public boolean createOrder(Client client, Product product, LocalDateTime timeOfOrder, BigDecimal quantity) {
        int valueOne = quantity.intValue();
        int valueTwo = (product.getPrice()).intValue();

        System.out.println("An order for " + product.getProductName() + " has been placed. Quantity of products: " + quantity + ". Total value: " + (valueOne * valueTwo));
        return true;
    }
}
