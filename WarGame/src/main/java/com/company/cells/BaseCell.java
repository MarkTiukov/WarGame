package com.company.cells;

public class BaseCell extends Cell {

    public BaseCell() {
        super();
    }

    public BaseCell(int X, int Y) {
        super(X, Y);
    }

    @Override
    public void draw() {
        System.out.println("Base at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }
}
