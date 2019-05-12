package com.kodilla.good.patterns.challenges.airline;

import java.util.Set;
import java.util.stream.Collectors;

public class DepartureSeeker implements FlightSeeker {

    private String departure;

    public DepartureSeeker(String departure) {
        this.departure = departure;
    }

    @Override
    public void findFlight() {
        Set<Flight> flightsWithDeparture = (new AllFlights()).getAllFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(departure))
                .collect(Collectors.toSet());

        if (flightsWithDeparture.size() == 0) {
            System.out.println("No flights from departure airport: " + departure + " found.");
        } else {
            System.out.println("Please check the flights from departure airport: " + departure);
            flightsWithDeparture.stream()
                    .map(f -> "Departure airport: " + f.getDepartureAirport() + " ***** Destination airport: " + f.getDestinationAirport())
                    .forEach(System.out::println);
        }
    }
}
