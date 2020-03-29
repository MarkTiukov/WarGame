package com.company.fractions;

import com.company.cells.*;

public abstract class Fraction {

    protected BaseCell base = null;
    protected FarmCell farm = null;

    public abstract BaseCell createBase(int x, int y);

    public void setBase(BaseCell base) {
        this.base = base;
    }

    public void setFarm(FarmCell farm) {
        this.farm = farm;
    }
}
