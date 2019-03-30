package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flightOne = new Flight("Berlin", "Hamburg");
        Flight flightTwo = new Flight("Montreal", "Tokio");
        Flight flightThree = new Flight("Malaga", "Honolulu");
        Flight flightFour = new Flight("Madras", "Johannesburg");
        Flight flightFive = new Flight("Pacanów", "Pipidówek");

        FlightSeeker flightSeeker = new FlightSeeker();

        try {
            System.out.println("Flight no.1: from Berlin to Hamburg");
            if(flightSeeker.findFlight(flightOne)) {
                System.out.println("Flight available, please book your ticket(s)");
            } else System.out.println("Sorry, airport(s) is/are temporary unavailable");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You for choosing our airlines\n");
        }

        try {
            System.out.println("Flight no.2: from Montreal to Tokio");
            if(flightSeeker.findFlight(flightTwo)) {
                System.out.println("Flight available, please book your ticket(s)");
            } else System.out.println("Sorry, airport(s) is/are temporary unavailable");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You for choosing our airlines\n");
        }

        try {
            System.out.println("Flight no.3: from Malaga to Honolulu");
            if(flightSeeker.findFlight(flightThree)) {
                System.out.println("Flight available, please book your ticket(s)");
            } else System.out.println("Sorry, airport(s) is/are temporary unavailable");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You for choosing our airlines\n");
        }

        try {
            System.out.println("Flight no.4: from Madras to Johannesburg");
            if(flightSeeker.findFlight(flightFour)) {
                System.out.println("Flight available, please book your ticket(s)");
            } else System.out.println("Sorry, airport(s) is/are temporary unavailable");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You for choosing our airlines\n");
        }

        try {
            System.out.println("Flight no.5: from Pacanów to Pipidówek");
            if(flightSeeker.findFlight(flightFive)) {
                System.out.println("Flight available, please book your ticket(s)");
            } else System.out.println("Sorry, airport(s) is/are temporary unavailable");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You for choosing our airlines\n");
        }




    }
}
