package com.company.cells;

public class AnimalBaseCell extends BaseCell {

    public AnimalBaseCell() {
        super();
    }

    public AnimalBaseCell(int X, int Y) {
        super(X, Y);
    }

    @Override
    public void draw() {
        System.out.println("Animal base at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print("AB" + "   ");
    }
}
