import Attractions.Rollercoster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercosterTest {
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Rollercoster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoster("Wizard");
        visitor1 = new Visitor(18, 180, 20);
        visitor2 = new Visitor(10, 180, 30);
        visitor3 = new Visitor(16, 90, 20);
        visitor4 = new Visitor(16, 205, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Wizard", rollercoaster.getName());
    }

    @Test
    public void acceptsVisitorBasedOnHeightAndAge(){
        rollercoaster.addVisitor(visitor1);
        assertEquals(1, rollercoaster.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnHeight(){
        rollercoaster.addVisitor(visitor3);
        assertEquals(0, rollercoaster.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorBasedOnAge(){
        rollercoaster.addVisitor(visitor2);
        assertEquals(0, rollercoaster.getVisitorsCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollercoaster.defaultPrice(), 0);
    }

    @Test
    public void chargesDefaultPriceUnder200cm(){
        assertEquals(8.40, rollercoaster.priceFor(visitor1), 0);
    }

    @Test
    public void chargesDoublePriceOver200cm(){
        assertEquals(16.80, rollercoaster.priceFor(visitor4), 0);
    }

}
