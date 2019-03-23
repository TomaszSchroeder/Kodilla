package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {

    private final Set<Country> continent;

    public Continent(final Set<Country> continent) {
        this.continent = continent;
    }

    public Set<Country> getContinent() {
        return continent;
    }
}
