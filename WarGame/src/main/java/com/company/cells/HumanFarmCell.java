package com.company.cells;

import com.company.factories.PeopleFactory4Units;

public class HumanFarmCell extends FarmCell {

    public HumanFarmCell() {
        super();
        this.factory = new PeopleFactory4Units();
    }

    public HumanFarmCell(int X, int Y) {
        this.factory = new PeopleFactory4Units(X, Y);
    }

    @Override
    public void draw() {
        System.out.println("Human farm at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }

    @Override
    public void drawInConsole() {
        System.out.print("HF" + "   ");
    }
}
