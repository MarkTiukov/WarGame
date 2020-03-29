package com.company.fields;

import com.company.Main;
import com.company.cells.BaseCell;

import java.util.Random;

public class FieldBuilderTwoPlayers implements FieldBuilder {
    // TODO
    // generateLoot()



    String[] fractionsIds;
    private Field field;

    public FieldBuilderTwoPlayers(int size, String[] fractionsId) {
        this.field = new Field(size);
        this.fractionsIds = fractionsId;
    }

    @Override
    public void generateLoot() {

    }

    @Override
    public void generateFractions() {
        Random random = new Random();



        int x1 = 1 + random.nextInt(this.field.getSize() / 3);
        int y1 = 1 + random.nextInt(this.field.getSize() / 3);

        BaseCell base = Main.playableFractions[0].createBase(x1, y1);
        Main.playableFractions[0].setBase(base);
        this.field.setCell(base);

        int x2 = this.field.getSize() - 2 - random.nextInt(this.field.getSize() / 3);
        int y2 = this.field.getSize() - 2 - random.nextInt(this.field.getSize() / 3);

        base = Main.playableFractions[1].createBase(x2, y2);
        Main.playableFractions[1].setBase(base);
        this.field.setCell(base);

    }

    @Override
    public Field getField() {
        return this.field;
    }
}
