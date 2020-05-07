package com.company.cells;

import com.company.fields.Field;
import com.company.loots.Loot;

public class EmptyCell extends Cell {

    private Loot loot = null;

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
        try {
            System.out.print(String.format("%-" + Field.widthForConsole + "s", "E" + this.loot.getValue()));
        } catch (NullPointerException e) {
            System.out.print(String.format("%-" + Field.widthForConsole + "s", "E"));

        }
    }

    public void setLoot(Loot loot) {
        this.loot = loot;
    }
}
