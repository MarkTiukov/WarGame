package com.company.cells;

import com.company.fields.Field;

public class AnimalBarrackCell extends BarrackCell {
    @Override
    public void draw() {
        System.out.println("Animal barrack at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print(String.format("%-" + Field.widthForConsole + "s", "ABar"));
    }
}
