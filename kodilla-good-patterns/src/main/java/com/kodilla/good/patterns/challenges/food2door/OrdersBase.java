package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdersBase {

    private List<Order> listOfOrders = new ArrayList<>();


    public ArrayList<Order> getAllOrders (){

        Company extraFoodShop = new ExtraFoodShop();
        Company healthyShop = new HealthyShop();
        Company glutenFreeShop = new GlutenFreeShop();

        Product javaCoffe = new Product("Java Coffe", new BigDecimal("189.90"));
        Product csharpEyeHerbs = new Product("CSharp eye herbs", new BigDecimal("24.45"));
        Product cppVitamin = new Product("C++ vitamin", new BigDecimal("19.95"));

        listOfOrders.add(new Order(1, LocalDateTime.of(2019, 5, 5, 13, 13), extraFoodShop, javaCoffe, 5, new BigDecimal("189.90")));
        listOfOrders.add(new Order(2, LocalDateTime.of(2019, 5, 7, 6, 21), healthyShop, cppVitamin, 15, new BigDecimal("24.45")));
        listOfOrders.add(new Order(3, LocalDateTime.of(2019, 5, 7, 8, 15), glutenFreeShop, csharpEyeHerbs, 25, new BigDecimal("19.95")));

        return new ArrayList<>(listOfOrders);
    }
}
