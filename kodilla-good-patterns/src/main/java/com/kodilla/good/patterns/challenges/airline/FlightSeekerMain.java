package com.kodilla.good.patterns.challenges.airline;

public class FlightSeekerMain {

    public static void main(String[] args) {

        FlightFinderExecutor flightFinderExecutor1 = new FlightFinderExecutor(new StopOverSeeker());
        flightFinderExecutor1.execute();
        System.out.println();

        FlightFinderExecutor flightFinderExecutor2 = new FlightFinderExecutor(new DepartureSeeker("Kraków"));
        flightFinderExecutor2.execute();
        System.out.println();

        FlightFinderExecutor flightFinderExecutor3 = new FlightFinderExecutor(new DestinationSeeker("Warszawa"));
        flightFinderExecutor3.execute();
    }
}
