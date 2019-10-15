package themePark;

import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;
import themepark.ThemePark;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    TobaccoStall tobaccoStall;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    Park park;
    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    ArrayList<Attraction>attractions;
    ArrayList<Stall>stalls;
    ThemePark themePark;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 3);
        park = new Park("Leafy Meadows", 9);
        dodgems = new Dodgems("Bumper Cars", 5);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        ArrayList<Stall> stalls = new ArrayList<Stall>();
        attractions.add(tobaccoStall);
        themePark = new ThemePark("Magic Land", attractions, stalls);

//        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
//        testNumbers.add(1);
//        testNumbers.add(2);
//        testNumbers.add(3);
//        testNumbers.add(4);
//        myNumbers = new NumberList(testNumbers);

    }

    @Test
    public void hasName() {
        assertEquals("Magic Land", themePark.getName());
    }
}
