package com.company.fractions;

import com.company.Main;
import com.company.cells.BaseCell;
import com.company.cells.FarmCell;

import java.util.ArrayList;

public abstract class Fraction {

    protected BaseCell base = null;
    protected ArrayList<FarmCell> farm = null;

    protected int money = 0;

    public abstract BaseCell createBase(int x, int y);

    public void setBase(BaseCell base) {
        this.base = base;
    }

    public void setFarm(FarmCell farm) {
        this.farm.add(farm);
    }

    public boolean buyFarm() {
        if (this.money < FarmCell.FARM_COST)
            return false;
        ArrayList<Integer> coordinates = this.chooseFarmLocation();
        this.setFarm(this.base.createFarm(coordinates.get(0), coordinates.get(1)));
        return true;
    }

    public ArrayList<Integer> chooseFarmLocation() {
        System.out.println("<Type coordinates for your farm>");
        System.out.println("<Farm must be located near your base>");
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(Main.scanner.nextInt());
        result.add(Main.scanner.nextInt());
        return result;
    }

}
