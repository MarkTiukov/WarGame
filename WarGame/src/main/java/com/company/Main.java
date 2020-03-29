package com.company;

import com.company.fields.Field;
import com.company.fields.FieldBuilder;
import com.company.fields.FieldBuilderTwoPlayers;
import com.company.fractions.AnimalFraction;
import com.company.fractions.Fraction;
import com.company.fractions.FractionsId;
import com.company.fractions.HumanFraction;

public class Main {

    public static Fraction playableFractions[];

    public static void main(String[] args) {


        ////
        playableFractions = new Fraction[2];
        playableFractions[0] = new HumanFraction();
        playableFractions[1] = new AnimalFraction();
        String[] ids = new String[2];
        ids[0] = FractionsId.PEOPLE_ID;
        ids[1] = FractionsId.ANIMALS_ID;
        FieldBuilder fieldBuilder = new FieldBuilderTwoPlayers(12, ids);
        fieldBuilder.generateFractions();
        Field field = fieldBuilder.getField();
        field.drawInConsole();
    }
}
