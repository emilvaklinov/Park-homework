import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Visitor visitor1;
    Visitor visitor2;
    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Green");
        visitor1 = new Visitor(21, 171, 50);
        visitor2 = new Visitor(31, 171, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Green", playground.getName());
    }

    @Test
    public void acceptsVisitorByAge(){
        playground.addVisitor(visitor2);
        assertEquals(1, playground.getVisitorsCount());
    }

    @Test
    public void rejectsVisitorByAge(){
        playground.addVisitor(visitor1);
        assertEquals(0, playground.getVisitorsCount());
    }

}
