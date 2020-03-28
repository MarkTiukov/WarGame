package com.company.fields;

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

        int x2 = this.field.getSize() - 2 - random.nextInt(this.field.getSize() / 3);
        int y2 = this.field.getSize() - 2 - random.nextInt(this.field.getSize() / 3);

    }

    @Override
    public Field getField() {
        return this.field;
    }
}
