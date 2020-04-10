package com.company.cells;

import com.company.factories.AnimalFactory4Units;
import com.company.fields.Field;

public class AnimalFarmCell extends FarmCell {

    public AnimalFarmCell() {
        super();
    }

    public AnimalFarmCell(int X, int Y) {
        super(X, Y);
    }

    public void draw() {
        System.out.println("Animal farm at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }


    @Override
    public void drawInConsole() {
        System.out.print(String.format("%-" + Field.widthForConsole + "s", "AF"));
    }


}
