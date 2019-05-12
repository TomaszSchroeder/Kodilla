package com.kodilla.good.patterns.challenges.airline;

public class FlightFinderExecutor {

    FlightSeeker flightSeeker;

    public FlightFinderExecutor(FlightSeeker flightSeeker) {
        this.flightSeeker = flightSeeker;
    }

    public void execute() {
        flightSeeker.findFlight();
    }
}
