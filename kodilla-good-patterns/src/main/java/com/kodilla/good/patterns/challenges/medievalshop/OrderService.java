package com.kodilla.good.patterns.challenges.medievalshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OrderService {

    public boolean createOrder(Client client, Product product, LocalDateTime timeOfOrder, BigDecimal quantity);
}
