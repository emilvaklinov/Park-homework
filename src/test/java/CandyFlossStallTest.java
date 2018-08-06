import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Any", "Emil", 150);
    }

    @Test
    public void hasName(){
        assertEquals("Any", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Emil", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(150, candyFlossStall.getParkingSpot());
    }

    @Test
    public void haDefaultPrice(){
        assertEquals(3.50, candyFlossStall.defaultPrice(), 0);
    }
}
