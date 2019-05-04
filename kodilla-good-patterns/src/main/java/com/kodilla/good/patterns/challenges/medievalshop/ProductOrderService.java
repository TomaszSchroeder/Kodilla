package com.kodilla.good.patterns.challenges.medievalshop;

public class ProductOrderService {

    public static void main(String[] args) {

        SwordOrder swordOrder = new SwordOrder();
        Order order = swordOrder.newOrderPlaced();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderServiceConfirmation(), new MobilePhoneInfo(), new OrderRepoSwords());
        OrderDTO orderDTO = orderProcessor.process(order);

        if (orderDTO.isSold()) {
            System.out.println("Order confirmation: " + orderDTO.getProduct().getProductName() + ". " + orderDTO.getProduct().getDescription() + ", has been sold to "
                    + orderDTO.getClient().getUserName() + " - " + orderDTO.getClient().getFirstName() + " " + orderDTO.getClient().getLastName() + " on " + order.getTimeOfOrder() );
        } else {
            System.out.println("Something went wrong, order can't be processed!");
        }
    }
}
