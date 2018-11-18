import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp() throws Exception {
        plane = new Plane(plane.getPlanetype());
    }

    @Test
    public void canGetPlaneModel() {
        assertEquals("ZEPPLIN", PlaneType.values());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(200, PlaneType.DC10.getCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(1000, PlaneType.BOEING747.getWeight());
    }
}
