import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Visitor visitor1;
    Dodgems dodgems;

    @Before
    public void before(){
        visitor1 = new Visitor(21, 180, 100);
        dodgems = new Dodgems("Any one");
    }

    @Test
    public void hasName(){
        assertEquals("Any one", dodgems.getName());
    }

    @Test
    public void canIncreaseVisitors(){
        dodgems.addVisitor(visitor1);
        assertEquals(1, dodgems.getVisitorsCount());
    }

    @Test
    public void canDecreaseVisitors(){
        dodgems.addVisitor(visitor1);
        dodgems.removeVisitor(visitor1);
        assertEquals(0, dodgems.getVisitorsCount());
    }
}
