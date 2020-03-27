package com.company.fields;

public interface FieldBuilder {
    /**
     * This pattern is used to be able to create different maps (which are high complicated objects)
     */

    void createField();
    void generateLoot();
    void generateFraction(); // generates bases for each fraction depending on the number of players
}
