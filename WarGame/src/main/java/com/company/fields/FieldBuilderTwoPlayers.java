package com.company.fields;

import com.company.fractions.*;

import java.util.Random;

public class FieldBuilderTwoPlayers implements FieldBuilder {
    private Field field;
    String[] fractionsIds;

    public FieldBuilderTwoPlayers(int size, String[] fractionsId) {
        this.field = new Field(size);
        this.fractionsIds = fractionsId;
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
        for (String id : this.fractionsIds) {

        }
    }
}
