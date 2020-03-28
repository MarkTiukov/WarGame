package com.company.cells;

public abstract class Cell {
    protected int coordinateX;
    protected int coordinateY;

    public Cell() {
        this.coordinateX = 0;
        this.coordinateY = 0;
    }

    public Cell(int X, int Y) {
        this.coordinateX = X;
        this.coordinateY = Y;
    }

    public abstract void draw();

}
