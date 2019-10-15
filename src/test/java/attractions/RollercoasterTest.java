package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(146, 145, 35.00);
        visitor2 = new Visitor(144, 144, 35.00);
        visitor3 = new Visitor(19, 201, 35.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void chargesDoubleToTallPerson() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.01);
    }

    @Test
    public void chargesDefaultFee() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void refusesPeopleUnder145Cm() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void allowsPeopleUnder145Cm() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

}
