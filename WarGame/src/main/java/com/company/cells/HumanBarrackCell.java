package com.company.cells;

import com.company.factories.PeopleFactory4Units;
import com.company.fields.Field;

public class HumanBarrackCell extends BarrackCell {

    public HumanBarrackCell() {
        this.factory = new PeopleFactory4Units();
    }

    public HumanBarrackCell(int X, int Y) {
        super(X, Y);
        this.factory = new PeopleFactory4Units(X, Y);
    }

    @Override
    public void draw() {
        System.out.println("Human barrack at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print(String.format("%-" + Field.widthForConsole + "s", "HBar"));
    }
}
