package com.company.fields;

import com.company.fractions.*;

import java.util.Random;

public class FieldBuilderTwoPlayers implements FieldBuilder {
    private Field field;

    public FieldBuilderTwoPlayers(int size, FractionsId[] fractionsId) {
        this.field = new Field(size);
    }

    @Override
    public void createField() {

    }

    @Override
    public void generateLoot() {

    }

    @Override
    public void generateFraction() {
        Random random = new Random();

    }
}
