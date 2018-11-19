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
        flight = new Flight("FR675",FlightDetails.FR675.getDepAirport(), FlightDetails.FR675.getArrAirport(), "16:30", plane);
        passenger1 = new Passenger("David", 4);
        passenger2 = new Passenger("Jules", 3);
        passenger3 = new Passenger("Esmee", 1);
        passenger4 = new Passenger("Bronte", 1);
        flight.bookSeat(passenger1, plane);
        flight.bookSeat(passenger2, plane);
        flight.bookSeat(passenger3, plane);
        flight.bookSeat(passenger4, plane);
        flightmanager = new FlightManager();
    }

    @Test
    public void canGetManifest() {
        assertNotNull(flight.getManifest());
    }

    @Test
    public void canGetPassengerSpecifiedBagWeight() {
        assertEquals(10, flightmanager.getPassengerSpecifiedBagWeight(plane));
    }

    @Test
    public void canGetPassengerBaggageWeight() {
        assertEquals(40, flightmanager.getPassengerBags(passenger1, plane));
    }

    @Test
    public void canGetTotalBaggageWeight() {
        assertEquals(90, flightmanager.getTotalBaggageWeight(flight, plane));
    }

    @Test
    public void canGetAvailableBaggeWeightNumber() {
        assertEquals(500, flightmanager.getAvailableBaggageWeightNumber(plane));
    }

    @Test
    public void canGetRemaingBaggageWeight() {
        assertEquals(410, flightmanager.getRemainingBaggageWeight(flight, plane));
    }
}

