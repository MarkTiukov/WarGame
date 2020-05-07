package com.company.fractions;

import com.company.cells.AnimalBaseCell;
import com.company.cells.BaseCell;
import com.company.cells.HumanBaseCell;

public class AnimalFraction extends Fraction {

    public AnimalFraction() {

    }

    @Override
    public BaseCell createBase(int x, int y) {
        BaseCell base = new AnimalBaseCell(x, y);
        return base;
    }
}
