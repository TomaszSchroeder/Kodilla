package com.kodilla.good.patterns.challenges.medievalshop;

public class MobilePhoneInfo implements InformationService {

    @Override
    public void sendOrderConfirmation(Client client) {
        System.out.println("Dear " + client.getFirstName() + " " + client.getLastName() + ", thank you for placing your order. It's heading your way. Your sincerely, Medieval Shop.");
    }
}
