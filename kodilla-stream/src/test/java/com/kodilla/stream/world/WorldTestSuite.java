package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {

    @Test
    public void testPeople() {
        Country poland = new Country("Polska", new BigDecimal("38000000"));
        Country germany = new Country("Niemcy", new BigDecimal("83000000"));
        Country russia = new Country("Rosja", new BigDecimal("143000000"));
        Country turkey = new Country("Turcja", new BigDecimal("60000000"));

        Country japan = new Country("Japonia", new BigDecimal("121000000"));
        Country mongolia = new Country("Mongolia", new BigDecimal("5000000"));

        Country australia = new Country("Australia", new BigDecimal("45000000"));
        Country newzealand = new Country("Nowa Zelandia", new BigDecimal("5000000"));

        Set<Country> europe = new HashSet<>();
        europe.add(poland);
        europe.add(germany);
        europe.add(russia);
        europe.add(turkey);
        Set<Country> asia = new HashSet<>();
        asia.add(japan);
        asia.add(russia);
        asia.add(mongolia);
        asia.add(turkey);
        Set<Country> australiaAndOceania = new HashSet<>();
        australiaAndOceania.add(australia);
        australiaAndOceania.add(newzealand);

        Continent europeanLand = new Continent(europe);
        Continent asianLand = new Continent(asia);
        Continent australianOceanianLand = new Continent(australiaAndOceania);

        Set<Continent> globe = new HashSet<>();
        globe.add(europeanLand);
        globe.add(asianLand);
        globe.add(australianOceanianLand);

        World world = new World(globe);
        BigDecimal output = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("500000000");

        Assert.assertEquals(expected, output);
    }

}
