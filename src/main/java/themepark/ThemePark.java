package themepark;

import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private Attraction attraction;
    private Stall stall;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;


    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();

    }

    public String getName() {
        return name;
    }



}








