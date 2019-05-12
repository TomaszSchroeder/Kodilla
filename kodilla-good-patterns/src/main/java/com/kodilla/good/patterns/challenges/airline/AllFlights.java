package com.kodilla.good.patterns.challenges.airline;

import java.util.HashSet;
import java.util.Set;

public class AllFlights {

    private final Set<Flight> allFlightsList;

    public AllFlights() {
        allFlightsList = new HashSet<>();
        allFlightsList.add(new Flight("Warszawa", "Berlin"));
        allFlightsList.add(new Flight("Berlin", "Hamburg"));
        allFlightsList.add(new Flight("Hamburg", "Gdańsk"));
        allFlightsList.add(new Flight("Gdańsk", "Mediolan"));
        allFlightsList.add(new Flight("Warszawa", "Mediolan"));
        allFlightsList.add(new Flight("Gdańsk", "Hamburg"));
        allFlightsList.add(new Flight("Warszawa", "Gdańsk"));
        allFlightsList.add(new Flight("Gdańsk", "Wrocław"));
        allFlightsList.add(new Flight("Berlin", "Warszawa"));
        allFlightsList.add(new Flight("Wrocław", "Hamburg"));
        allFlightsList.add(new Flight("Hamburg", "Mediolan"));
        allFlightsList.add(new Flight("Mediolan", "Berlin"));
        allFlightsList.add(new Flight("Mediolan", "Warszawa"));
        allFlightsList.add(new Flight("Wrocław", "Warszawa"));
    }

    public Set<Flight> getAllFlightsList() {
        return allFlightsList;
    }
}
