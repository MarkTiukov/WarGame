package com.company.mygraphics;

import java.util.Random;

public enum Pictures {
    EMPTY1,
    EMPTY2,
    EMPTY3;

    public static Pictures getRandomEmpty() {
        Random random = new Random();
        switch (random.nextInt(3) + 1) {
            case 1:
                return EMPTY1;
            case 2:
                return EMPTY2;
            case 3:
                return EMPTY3;
            default:
                System.err.println("error randomising");
                break;
        }
        return null;
    }
}
