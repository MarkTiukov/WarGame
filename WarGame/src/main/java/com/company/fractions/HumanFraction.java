package com.company.fractions;

import com.company.cells.BaseCell;
import com.company.cells.HumanBaseCell;

public class HumanFraction extends Fraction {

    public HumanFraction() {

    }

    @Override
    public BaseCell createBase(int x, int y) {
        BaseCell base = new HumanBaseCell(x, y);
        return base;
    }

}
