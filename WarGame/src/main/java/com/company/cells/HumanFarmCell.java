package com.company.cells;

import com.company.fields.Field;

public class HumanFarmCell extends FarmCell {

    public HumanFarmCell() {
        super();
    }

    public HumanFarmCell(int X, int Y) {
    }

    @Override
    public void draw() {
        System.out.println("Human farm at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print(String.format("%-" + Field.widthForConsole + "s", "HF"));
    }
}
