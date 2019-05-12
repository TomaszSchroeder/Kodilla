package com.kodilla.good.patterns.challenges.airline;

public class Flight {

    private final String departureAirport;
    private final String destinationAirport;

    public Flight(final String departureAirport, final String destinationAirport) {
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        return destinationAirport.equals(flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        return result;
    }
}
