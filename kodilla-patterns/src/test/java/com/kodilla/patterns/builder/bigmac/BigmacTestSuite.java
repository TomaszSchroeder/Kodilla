package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {

        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SEZAME)
                .burgers(2)
                .sauce(Sauce.BARBECUE)
                .ingredients(Ingredients.CHILLI)
                .ingredients(Ingredients.SHRIMPS)
                .ingredients(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);

        // When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatKindOfBun = String.valueOf(bigmac.getBun());
        int howManyBurgers = bigmac.getBurgers();

        // Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("WITH_SEZAME", whatKindOfBun);
        Assert.assertEquals(2, howManyBurgers);
    }

}
