import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightManagerTest {

    Plane plane;
    PlaneType planeType;
    FlightManager flightmanager;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void setUp() throws Exception {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight("FR675",FlightDetails.FR675.getDepAirport(), FlightDetails.FR675.getArrAirport(), "16:30");
        passenger1 = new Passenger("David", 4);
        passenger2 = new Passenger("Jules", 3);
        passenger3 = new Passenger("Esmee", 1);
        passenger4 = new Passenger("Bronte", 1);
        flight.bookSeat(passenger1);
        flight.bookSeat(passenger2);
        flight.bookSeat(passenger3);
        flight.bookSeat(passenger4);
        flightmanager = new FlightManager(flight, passenger1);
    }

    @Test
    public void canGetManifest() {
        assertNotNull(flight.getManifest());
    }

    @Test
    public void canGetPassengerSpecififiedBagWeight() {
        assertEquals(10, flightmanager.getPassengerSpecifiedBagWeight());
    }

    @Test
    public void canGetPassengerBaggageWeight() {
        assertEquals(40, flightmanager.getPassengerBags(passenger1));
    }

    @Test
    public void canGetTotalBaggageWeight() {
        assertEquals(90, flightmanager.getTotalBaggageWeight());
    }

    @Test
    public void canGetAvailableBaggeWeightNumber() {
        assertEquals(500, flightmanager.getAvailableBaggeWeightNumber());
    }

    @Test
    public void canGetRemaingBaggageWeight() {
        assertEquals(410, flightmanager.getRemainingBaggageWeight());
    }
}

