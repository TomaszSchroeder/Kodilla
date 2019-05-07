package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;

public class MainShop {

    public static void main(String[] args) {

        OrdersBase ordersBase = new OrdersBase();
        ArrayList<Order> allOrders = ordersBase.getAllOrders();

        for(Order order : allOrders) {
            OrderDTO orderDTO = order.getCompany().process(order);
            double price = (order.getPricePerPiece()).doubleValue();

            if(orderDTO.isSold()) {
                System.out.println("Here are your order's details: \nid zamówienia: " + order.getOrderId() + "\ndata zamówienia: " + order.getOrderTime() + "\nnazwa towaru: " + order.getProduct().getProductName() +
                        "\nproducent: " + order.getCompany().getCompanyName() + "\nsztuk: " + order.getQuantity() + "\nprice per piece: " + order.getPricePerPiece() + "\ntotal value: " + (order.getQuantity()*price) + "\n");
            }
        }
    }
}
