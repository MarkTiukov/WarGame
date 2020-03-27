package com.company;

import com.company.factories.*;
import com.company.units.*;

public class Main {

    public static void main(String[] args) {
        PeopleFactory4Units peopleFactory4Units = new PeopleFactory4Units();
        peopleFactory4Units.createArcher().draw();

    }
}
