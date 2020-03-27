package com.company;

public abstract class Cell {
    private int coordinateX;
    private int coordinateY;

    public Cell() {
        coordinateX = 0;
        coordinateY = 0;
    }

    public Cell(int X, int Y) {
        this.coordinateX = X;
        this.coordinateY = Y;
    }
}
