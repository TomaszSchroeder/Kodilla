package com.kodilla.good.patterns.challenges.airline;

public class StopOverFlight {

    private final String departureAirport;
    private final String stopOverAirport;
    private final String destinationAirport;

    public StopOverFlight(final String departureAirport, final String stopOverAirport, final String destinationAirport) {
        this.departureAirport = departureAirport;
        this.stopOverAirport = stopOverAirport;
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getStopOverAirport() {
        return stopOverAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StopOverFlight that = (StopOverFlight) o;

        if (!departureAirport.equals(that.departureAirport)) return false;
        if (!stopOverAirport.equals(that.stopOverAirport)) return false;
        return destinationAirport.equals(that.destinationAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + stopOverAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        return result;
    }
}
