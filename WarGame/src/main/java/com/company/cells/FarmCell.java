package com.company.cells;

import com.company.factories.AbsFactory4Units;
import com.company.units.WarriorUnit;

public abstract class FarmCell extends Cell {

    public static final int FARM_COST = 10;
    public AbsFactory4Units factory = null;

    public FarmCell() {
        super();
    }

    public FarmCell(int X, int Y) {
        super(X, Y);
    }

}
