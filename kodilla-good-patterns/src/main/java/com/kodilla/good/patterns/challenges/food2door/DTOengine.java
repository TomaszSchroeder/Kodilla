package com.kodilla.good.patterns.challenges.food2door;

public class DTOengine {

    Order order;

    public DTOengine(Order order) {
        this.order = order;
    }

    public static OrderDTO getOrderDTO(Order order) {
        RollTheDice rollTheDice = new RollTheDice();

        boolean isSold = rollTheDice.trueOrFalse();

        if(isSold) {
            System.out.println("Order " + order.getOrderId() + " is completed.\n");

            return new OrderDTO(order.getOrderId(), order.getOrderTime(), order.getCompany(), order.getProduct(), order.getQuantity(), order.getPricePerPiece(), true );
        } else {
            System.out.println("We are sorry, but your order " + order.getOrderId() + " couldn't be processed. Please try again!\n" );

            return new OrderDTO(order.getOrderId(), order.getOrderTime(), order.getCompany(), order.getProduct(), order.getQuantity(), order.getPricePerPiece(), false );
        }
    }
}
