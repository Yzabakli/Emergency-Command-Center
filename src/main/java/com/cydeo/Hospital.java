package com.cydeo;

import java.util.Arrays;

public class Hospital {

    private String name;
    private int availableRooms;
    private int[] coordinates;
    private boolean hasBurnCareUnit;

    public Hospital(String name, int availableRooms, int[] coordinates, boolean hasBurnCareUnit) {
        this.name = name;
        this.availableRooms = availableRooms;
        this.coordinates = coordinates;
        this.hasBurnCareUnit = hasBurnCareUnit;
    }

    public String getName() {
        return name;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public boolean isHasBurnCareUnit() {
        return hasBurnCareUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public void setHasBurnCareUnit(boolean hasBurnCareUnit) {
        this.hasBurnCareUnit = hasBurnCareUnit;
    }

    public int getDistanceToAmbulance() {
        return Math.abs(coordinates[0] - DataGenerator.ambulance.getCoordinates()[0]) +
                Math.abs(coordinates[1] - DataGenerator.ambulance.getCoordinates()[1]);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", availableRooms=" + availableRooms +
                ", coordinates=" + Arrays.toString(coordinates) +
                ", hasBurnCareUnit=" + hasBurnCareUnit +
                '}';
    }
}
