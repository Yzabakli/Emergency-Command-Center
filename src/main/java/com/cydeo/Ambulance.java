package com.cydeo;

public class Ambulance {

    private final int[] Coordinates;

    public Ambulance(int[] coordinates) {
        Coordinates = coordinates;
    }

    public int[] getCoordinates() {
        return Coordinates;
    }
}
