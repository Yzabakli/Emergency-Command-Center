package com.cydeo;

import java.util.HashSet;
import java.util.Set;

public class DataGenerator {

    public static Ambulance ambulance = new Ambulance(new int[]{14, 7});

    public static Set<Hospital> hospitals = new HashSet<>(Set.of(
            new Hospital("St. Joseph’s University Medical", 3, new int[]{1, 9}, true),
            new Hospital("Saint Michael’s Medical Center", 8, new int[]{6, 7}, false),
            new Hospital("Woodhull Hospital", 8, new int[]{9, 7}, false),
            new Hospital("The Mount Sinai Hospital", 0, new int[]{13, 7}, false),
            new Hospital("NYC Health Hospital", 1, new int[]{14, 9}, true),
            new Hospital("Care Well Health Medical Center", 0, new int[]{5, 4}, true),
            new Hospital("Staten Island University Hospital", 5, new int[]{2, 2}, false),
            new Hospital("Kings County Hospital Center", 14, new int[]{8, 2}, false),
            new Hospital("Brookdale University Hospital", 1, new int[]{11, 3}, false)
    ));

}
