package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Company {

    private String companyName = "ExtraFoodShop";
    DTOengine DTOengine;

    public ExtraFoodShop() {
        this.companyName = companyName;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public OrderDTO process(Order order) {

        return DTOengine.getOrderDTO(order);
    }
}
