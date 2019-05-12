package com.kodilla.good.patterns.challenges.airline;

import java.util.Set;
import java.util.stream.Collectors;

public class DestinationSeeker implements FlightSeeker {

    private String destination;

    public DestinationSeeker(String destination) {
        this.destination = destination;
    }

    @Override
    public void findFlight() {
        Set<Flight> flightsWithDestination = (new AllFlights()).getAllFlightsList().stream()
                .filter(f -> f.getDestinationAirport().equals(destination))
                .collect(Collectors.toSet());

        if (flightsWithDestination.size() == 0) {
            System.out.println("No flights to destination airport: " + destination + " found.");
        } else {
            System.out.println("Please check the flight to destination airport: " + destination);
            flightsWithDestination.stream()
                    .map(f -> "Departure airport: " + f.getDepartureAirport() + " ***** Destination airport: " + f.getDestinationAirport())
                    .forEach(System.out::println);
        }
    }
}
