package com.company.fractions;

import java.util.ArrayList;

public class FractionsId {
    private static int number = 2;

    public static final String PEOPLE_ID = "PEOPLE";
    public static final String ANIMALS_ID = "ANIMALS";
    // public static final String ROBOTS_ID = "ROBOTS";

    public static void addAll(ArrayList<String> list) {
        list.add(PEOPLE_ID);
        list.add(ANIMALS_ID);
    }

}
