package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithExtraCheeseCost() {

        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        // When
        BigDecimal theCost = theOrder.getCost();

        // Then
        assertEquals(new BigDecimal(13), theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseDescription() {

        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Basic pizza with cheese and tomato sauce + extra cheese", description);
    }

    @Test
    public void testPizzaWithEverythingCost() {

        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SeaFoodDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new JackDanielsSauce(theOrder);

        // When
        BigDecimal theCost = theOrder.getCost();

        // Then
        assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    public void testPizzaWithEverythingDescription() {

        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SeaFoodDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new ChampignonsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new JackDanielsSauce(theOrder);

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Basic pizza with cheese and tomato sauce + extra cheese + seafood + ham + champignons + olives + new Jack Daniels sauce", description);

    }

}
