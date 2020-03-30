package com.company.cells;

import com.company.factories.AnimalFactory4Units;

public class AnimalFarmCell extends FarmCell {

    public AnimalFarmCell() {
        super();
        this.factory = new AnimalFactory4Units();
    }

    public AnimalFarmCell(int X, int Y) {
        super(X, Y);
        this.factory = new AnimalFactory4Units(X, Y);
    }

    public void draw() {
        System.out.println("Animal farm at (" + this.coordinateX + "; " + this.coordinateY + ")");
    }


    @Override
    public void drawInConsole() {
        System.out.print("AF" + "   ");
    }


}
