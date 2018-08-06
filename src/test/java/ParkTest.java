import Attractions.Park;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Visitor visitor;
    Park park;

    @Before
    public void before(){
        visitor = new Visitor(21, 180, 100);
        park = new Park("Meadows");
    }

    @Test
    public void hasName(){
        assertEquals("Meadows", park.getName());
    }

}
