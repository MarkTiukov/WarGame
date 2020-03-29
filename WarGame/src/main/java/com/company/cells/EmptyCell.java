package com.company.cells;

public class EmptyCell extends Cell {

    public EmptyCell() {
        super();
    }

    public EmptyCell(int X, int Y) {
        super(X, Y);
    }

    @Override
    public void draw() {
        System.out.println("Empty cell at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print("E" + "    ");
    }
}
