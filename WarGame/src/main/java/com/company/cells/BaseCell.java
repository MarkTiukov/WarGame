package com.company.cells;

public abstract class BaseCell extends Cell {

    public BaseCell() {
        super();
    }

    public BaseCell(int X, int Y) {
        super(X, Y);
    }

    public abstract FarmCell createFarm(int x, int y);

}
