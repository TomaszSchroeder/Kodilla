package com.kodilla.good.patterns.challenges.food2door;

public class MainShop {

    public static void main(String[] args) {

        OrdersBase ordersBase = new OrdersBase();
        OrderService orderService = new OrderService();

        orderService.orderStatus(ordersBase);
    }


}
