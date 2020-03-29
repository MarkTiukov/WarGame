package com.company.factories;

import com.company.units.*;

public class AnimalFactory4Units implements AbsFactory4Units {

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
