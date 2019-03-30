package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {


    FlightSeeker flightSeeker;

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Hamburg", true);
        airports.put("Malaga", true);
        airports.put("Reykjavik", true);
        airports.put("Madras", false);
        airports.put("Tokio", true);
        airports.put("Naples", true);
        airports.put("Johannesburg", false);
        airports.put("New York", false);
        airports.put("Berlin", true);
        airports.put("Athens", false);

        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();

        boolean arrivalAirportExists = airports.containsKey(arrivalAirport);
        boolean departureAirportExists = airports.containsKey(departureAirport);

        if (arrivalAirportExists && departureAirportExists) {
            return airports.get(arrivalAirport) && airports.get(departureAirport);

        } else {

            if (!arrivalAirportExists && !departureAirportExists) {
                throw new RouteNotFoundException("There are no airports like these!");
            } else if (!arrivalAirportExists) {
                throw new RouteNotFoundException("Arrival airport don't exist!");
            } else if (!departureAirportExists) {
                throw new RouteNotFoundException("Departure airport don't exist!");
            } else
                throw new RouteNotFoundException("Flight impossible today!");

        }
    }


}
