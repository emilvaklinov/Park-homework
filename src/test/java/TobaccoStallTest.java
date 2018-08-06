import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    Visitor visitor1;
    Visitor visitor2;
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Rotmans", "Bea", 20);
        visitor1 = new Visitor(280, 165, 70);
        visitor2 = new Visitor(16, 170, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Rotmans", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Bea", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(20, tobaccoStall.getParkingSpot());
    }

    @Test
    public void acceptsVisitorBasedOnAge(){
        tobaccoStall.addVisitor(visitor1);
        assertEquals(1, tobaccoStall.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnAge(){
        tobaccoStall.addVisitor(visitor2);
        assertEquals(0, tobaccoStall.getVisitorsCount());
    }

    @Test
    public void haDefaultPrice(){
        assertEquals(9.60, tobaccoStall.defaultPrice(), 0);
    }
}
