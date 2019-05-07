package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Company {

    private String companyName = "GlutenFreeShop";
    DTOengine DTOengine;

    public GlutenFreeShop() {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public OrderDTO process(Order order) {

        return DTOengine.getOrderDTO(order);
    }
}
