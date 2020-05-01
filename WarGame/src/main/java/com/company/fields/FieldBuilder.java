package com.company.fields;

public interface FieldBuilder {
    /**
     * This pattern is used to be able to create different maps (which are high complicated objects)
     */

    void generateLoot();
    void generateFractions(); // generates bases for each fraction depending on the number of players

    Field getField();
    int getSize();

}
