package com.company.cells;

import com.company.factories.AbsFactory4Units;

public abstract class BarrackCell extends Cell{

    public static final int BARRACK_COST = 100;

    protected AbsFactory4Units factory = null;

    public BarrackCell() {}

    public BarrackCell(int X, int Y) {
        super(X, Y);
    }
}
