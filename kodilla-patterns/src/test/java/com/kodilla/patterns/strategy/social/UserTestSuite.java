package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDeafultSharingStrategies() {
        // Given
        User stefek = new Millenials("Mietek Skarpeta");
        User ziutek = new YGeneration("Ziutek Butek");
        User rysiek = new ZGeneration("Rysiek z Klanu");

        // When
        String stefekIsUsing = stefek.useMediaType();
        System.out.println("Stefek's activity: " + stefekIsUsing);
        String ziutekIsUsing = ziutek.useMediaType();
        System.out.println("Ziutek's activity: " + ziutekIsUsing);
        String rysiekIsUsing = rysiek.useMediaType();
        System.out.println("Rysiek's activity: " + rysiekIsUsing);

        // Then
        Assert.assertEquals("Publishing with Facebook", stefekIsUsing);
        Assert.assertEquals("Publishing with Twitter", ziutekIsUsing);
        Assert.assertEquals("Publishing with Snapchat", rysiekIsUsing);
    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given
        User gienek = new Millenials("Gienek Benek");

        // When
        String gienekIsUsing = gienek.useMediaType();
        System.out.println("Gienek's activity: " + gienekIsUsing);
        gienek.setFavouriteSocialPublisher(new TwitterPublisher());
        gienekIsUsing = gienek.useMediaType();
        System.out.println("Gienek's present activity: " + gienekIsUsing);

        // Then
        Assert.assertEquals("Publishing with Twitter", gienekIsUsing);
    }
}
