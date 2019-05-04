package com.kodilla.good.patterns.challenges.medievalshop;

public class OrderProcessor {

    private OrderService orderService;
    private InformationService informationService;
    private OrderRepo orderRepo;

    public OrderProcessor(OrderService orderService, InformationService informationService, OrderRepo orderRepo) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepo = orderRepo;
    }

    public OrderDTO process(Order order) {
        boolean isSold = orderService.createOrder(order.getClient(), order.getProduct(),
                order.getTimeOfOrder(), order.getQuantity());

        if (isSold) {
            order.getClient().moveOrderToPastOrders(order);
            informationService.sendOrderConfirmation(order.getClient());
            orderRepo.addToOrderRepo(order);
            return new OrderDTO(order.getClient(), order.getProduct(), true);
        } else {
            return new OrderDTO(order.getClient(), order.getProduct(), false);
        }
    }
}
