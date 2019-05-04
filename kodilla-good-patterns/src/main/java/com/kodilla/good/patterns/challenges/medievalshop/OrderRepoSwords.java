package com.kodilla.good.patterns.challenges.medievalshop;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoSwords implements OrderRepo {

    List<Order> swordOrderRepo = new ArrayList<>();

    @Override
    public void addToOrderRepo(Order order) {

        swordOrderRepo.add(order);
    }
}
