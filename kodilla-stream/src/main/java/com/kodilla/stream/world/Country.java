package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal inhabitants;

    public Country(final String countryName, BigDecimal inhabitants) {
        this.countryName = countryName;
        this.inhabitants = inhabitants;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getInhabitants() {
        return inhabitants;
    }

    public BigDecimal getPeopleQuantity() {
        return inhabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!countryName.equals(country.countryName)) return false;
        return inhabitants.equals(country.inhabitants);
    }

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + inhabitants.hashCode();
        return result;
    }
}
