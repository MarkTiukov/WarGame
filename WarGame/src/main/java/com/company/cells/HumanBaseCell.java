package com.company.cells;

import com.company.fields.Field;

public class HumanBaseCell extends BaseCell {

    public HumanBaseCell() {
        super();
    }

    public HumanBaseCell(int X, int Y) {
        super(X, Y);
    }

    @Override
    public FarmCell createFarm(int x, int y) {
        FarmCell farm = new HumanFarmCell(x, y);
        return farm;
    }

    @Override
    public void draw() {
        System.out.println("Human base at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print(String.format("%-" + Field.widthForConsole + "s", "HB"));
    }


}
