import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp() throws Exception {
        passenger = new Passenger("David", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("David",passenger.getName());
    }

    @Test
    public void canGetBagCount() {
        assertEquals(1,passenger.getBags());
    }
}
