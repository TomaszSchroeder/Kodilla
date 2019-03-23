package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

    private final Set<Continent> world;

    public World(final Set<Continent> world) {
        this.world = world;
    }

    public Set<Continent> getWorld() {
        return world;
    }

    public BigDecimal getPeopleQuantity() {

        BigDecimal allThePeople = world.stream()
                .flatMap(globe -> globe.getContinent().stream())
                .distinct()
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


        return allThePeople;
    }
}
