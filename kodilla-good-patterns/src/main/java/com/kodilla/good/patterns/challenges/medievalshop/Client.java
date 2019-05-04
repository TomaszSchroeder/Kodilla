package com.kodilla.good.patterns.challenges.medievalshop;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String firstName;
    private String lastName;
    private String userName;

    public Client(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    private List<Order> pastOrders = new ArrayList<>();

    public void moveOrderToPastOrders(Order order) {
        pastOrders.add(order);
    }
}
