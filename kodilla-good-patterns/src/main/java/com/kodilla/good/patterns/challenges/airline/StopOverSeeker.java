package com.kodilla.good.patterns.challenges.airline;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StopOverSeeker implements FlightSeeker {

    private AllFlights allFlights;

    public StopOverSeeker() {
        this.allFlights = new AllFlights();
    }

    @Override
    public void findFlight() {
        Set<StopOverFlight> flightsWithStopOver = new HashSet<>();
        for (Flight flight: allFlights.getAllFlightsList()) {
            Set<StopOverFlight> temporarySet = allFlights.getAllFlightsList().stream()
                    .filter(f -> f.getDepartureAirport().equals(flight.getDestinationAirport()) && !(f.getDestinationAirport().equals(flight.getDepartureAirport())))
                    .map(f -> new StopOverFlight(flight.getDepartureAirport(), f.getDepartureAirport(), f.getDestinationAirport()))
                    .collect(Collectors.toSet());

            flightsWithStopOver.addAll(temporarySet);
        }

        if (flightsWithStopOver.size() == 0) {
            System.out.println("No flights with stop over found.");
        } else {
            System.out.println("Please check the flights with stop over below:");
            flightsWithStopOver.stream()
                    .map(f -> "Departure airport: " + f.getDepartureAirport() +
                            " ***** Stop Over at airport: " + f.getStopOverAirport() +
                            " ***** Destination airport: " + f.getDestinationAirport())
                    .forEach(System.out::println);
        }
    }
}
