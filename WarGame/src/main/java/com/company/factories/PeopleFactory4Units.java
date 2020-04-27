package com.company.factories;

import com.company.units.*;

public class PeopleFactory4Units implements AbsFactory4Units {

    private int x, y;

    public PeopleFactory4Units() {
        this.x = 0;
        this.y = 0;
    }

    public PeopleFactory4Units(int x, int y) {
        this.x = x;
        this.y = y;
    }

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
