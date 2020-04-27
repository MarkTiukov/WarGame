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

    public int getX() {
        return coordinateX;
    }

    public void setX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getY() {
        return coordinateY;
    }

    public void setY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public abstract void draw();
    public abstract void drawInConsole();


}
