package com.cydeo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.cydeo.DataGenerator.ambulance;
import static com.cydeo.DataGenerator.hospitals;

public class Main {
    public static void main(String[] args) {

        Map.Entry<Hospital, Integer> availableHospitalList = getAvailableHospitalList(hospitals, ambulance.getCoordinates(), false);

        System.out.println(availableHospitalList.getKey().getName() + ", " + availableHospitalList.getValue());

        Hospital hospital = new Hospital("kdf", 5, new int[]{1,2}, true);
        Hospital hospital1 = hospital;

        hospital.setAvailableRooms(1);
        hospital1.setName("seruf");
        System.out.println(hospital + "\n" + hospital1);

    }

    private static Map.Entry<Hospital, Integer> getAvailableHospitalList(Set<Hospital> hospitals,
                                                                         int[] ambulanceCoordinates,
                                                                         boolean patientHasBurnWound){

        Hospital nearest;

        if (patientHasBurnWound){

            nearest = hospitals.stream()
                    .filter(Hospital::isHasBurnCareUnit)
                    .filter(hospital -> hospital.getAvailableRooms() > 0)
                    .sorted(Comparator.comparing(Hospital::getDistanceToAmbulance))
                    .findFirst()
                    .orElse(hospitals.stream()
                            .filter(Hospital::isHasBurnCareUnit)
                            .sorted(Comparator.comparing(Hospital::getDistanceToAmbulance)).findFirst().get());
            return Map.entry(nearest, nearest.getDistanceToAmbulance());
        }
        nearest = hospitals.stream()
                .filter(hospital -> hospital.getAvailableRooms() > 0)
                .sorted(Comparator.comparing(Hospital::getDistanceToAmbulance))
                .findFirst()
                .orElse(hospitals.stream()
                        .sorted(Comparator.comparing(Hospital::getDistanceToAmbulance)).findFirst().get());
        return Map.entry(nearest, nearest.getDistanceToAmbulance());
    }
}
