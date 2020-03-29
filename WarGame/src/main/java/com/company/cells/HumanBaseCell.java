package com.company.cells;

public class HumanBaseCell extends BaseCell {

    public HumanBaseCell() {
        super();
    }

    public HumanBaseCell(int X, int Y) {
        super(X, Y);
    }

    @Override
    public void draw() {
        System.out.println("Human base at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print("HB" + "   ");
    }


}
