package com.company.factories;

import com.company.units.*;

public class AnimalFactory4Units implements AbsFactory4Units {

    private int x, y;

    public AnimalFactory4Units() {
        this.x = 0;
        this.y = 0;
    }

    public AnimalFactory4Units(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public WarriorUnit createWarrior() {
        WarriorUnit warrior = new WolfUnit();
        return warrior;
    }

    @Override
    public ArcherUnit createArcher() {
        ArcherUnit archer = new MonkeyUnit();
        return archer;
    }


}
