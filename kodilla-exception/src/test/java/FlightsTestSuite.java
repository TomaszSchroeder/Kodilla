import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSeeker;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.Test;

public class FlightsTestSuite {


    @Test
    public void closedBothAirports() {
        // Given
        Flight flightOne = new Flight("Berlin", "Hamburg");
        Flight flightTwo = new Flight("Montreal", "Tokio");
        Flight flightThree = new Flight("Malaga", "Honolulu");
        Flight flightFour = new Flight("Madras", "Johannesburg");

        FlightSeeker flightSeeker = new FlightSeeker();

        // When
        try {
            System.out.println("Flight no.4: from Madras to Johannesburg");
            if (flightSeeker.findFlight(flightFour))
                System.out.println("Flight available, please book your ticket(s)");
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You for choosing our airlines\n");
        }

        // Then


    }
}
