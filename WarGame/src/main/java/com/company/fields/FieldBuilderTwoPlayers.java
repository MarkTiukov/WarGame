package com.company.fields;

import com.company.Main;
import com.company.cells.BaseCell;
import com.company.fractions.Fraction;

import java.util.Random;

public class FieldBuilderTwoPlayers implements FieldBuilder {
    // TODO
    // generateLoot()



    Fraction[] fractions;
    private Field field;

    public FieldBuilderTwoPlayers(int size, Fraction[] fractionsId) {
        this.field = new Field(size);
        this.fractions = fractionsId;
    }

    @Override
    public void generateLoot() {

    }

    @Override
    public void generateFractions() {
        Random random = new Random();



        int x1 = 1 + random.nextInt(this.field.getSize() / 3);
        int y1 = 1 + random.nextInt(this.field.getSize() / 3);

        BaseCell base = this.fractions[0].createBase(x1, y1);
        this.fractions[0].setBase(base);
        this.field.setCell(base);

        int x2 = this.field.getSize() - 2 - random.nextInt(this.field.getSize() / 3);
        int y2 = this.field.getSize() - 2 - random.nextInt(this.field.getSize() / 3);

        base = this.fractions[1].createBase(x2, y2);
        this.fractions[1].setBase(base);
        this.field.setCell(base);

    }

    @Override
    public Field getField() {
        generateLoot();
        generateFractions();
        return this.field;
    }
}
