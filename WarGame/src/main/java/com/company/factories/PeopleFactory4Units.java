package com.company.factories;

import com.company.units.*;

public class PeopleFactory4Units implements AbsFactory4Units {

    @Override
    public WarriorUnit createWarrior() {
        WarriorUnit warrior = new SoldierUnit();
        return warrior;
    }

    @Override
    public ArcherUnit createArcher() {
        ArcherUnit archer = new RiflemanUnit();
        return archer;
    }
}
