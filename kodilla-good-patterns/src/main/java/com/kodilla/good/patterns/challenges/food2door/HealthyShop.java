package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Company {

    private String companyName = "HealthyShop";

    DTOengine DTOengine;

    public HealthyShop() {
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
