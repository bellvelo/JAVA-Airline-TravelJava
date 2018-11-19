import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class FlightTest {
    
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void setUp() throws Exception {
        flight = new Flight("FR675",FlightDetails.FR675.getDepAirport(), FlightDetails.FR675.getArrAirport(), "16:30", plane);
        passenger = new Passenger("David", 2);
        plane = new Plane(PlaneType.BOEING747);
    }

//    @Test
//    public void canGetPlane() {
//        assertNotNull(flight.getPlane());
//    }

    @Test
    public void canGetManifest() {
        flight.bookSeat(passenger, plane);
        flight.bookSeat(passenger, plane);
        assertNotNull(flight.getManifest());
    }

    @Test
    public void canGetFlightNo() {
        assertEquals("FR675", flight.getFlightNo());
    }
    @Test
    public void canGetDepAirport() {
        assertEquals("GLA", flight.getDepAirport());
    }
    @Test
    public void canGetArrAirport() {
        assertEquals("CDG", flight.getArrAirport());
    }
    @Test
    public void canGetDepartTime() {
        assertEquals("16:30", flight.getDepTime());
    }

    @Test
    public void canStartWithEmptyPlane() {
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canBookPassengerOnPlane() {
        flight.bookSeat(passenger, plane);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void cantBookPassengerOnPlane() {
        for(int i=0; i<199; i++){
            flight.bookSeat(passenger, plane);
        }
        assertEquals(100, flight.getPassengerCount());
    }

    @Test
    public void canGetAvailableSeats() {
        for(int i=0; i<99; i++){
            flight.bookSeat(passenger, plane);
        }
        assertEquals(1, flight.getRemainingSeats(plane));
    }
}
