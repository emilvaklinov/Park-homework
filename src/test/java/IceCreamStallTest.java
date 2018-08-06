import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Any", "Emil", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Any", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Emil", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(10, iceCreamStall.getParkingSpot());
    }

    @Test
    public void haDefaultPrice(){
        assertEquals(1.90, iceCreamStall.defaultPrice(), 0);
    }
}
