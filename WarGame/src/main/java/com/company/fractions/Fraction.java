package com.company.fractions;

import com.company.Main;
import com.company.cells.BaseCell;
import com.company.cells.FarmCell;

import java.util.ArrayList;

public abstract class Fraction {

    protected BaseCell base = null;
    protected ArrayList<FarmCell> farms = new ArrayList<>();

    protected int money = 100;

    public ArrayList<Integer> chooseFarmLocation() {
        System.out.println("<Type coordinates for your farm>");
        System.out.println("<Farm must be located near your base>");
        ArrayList<Integer> result = new ArrayList<>();
        int x = this.base.getX() - 1;
        int y = this.base.getY() - 1;
        boolean incorrect = true;
        while (incorrect) {
            // TODO fix condition for correct position
            if (Math.abs(x - this.base.getX()) + Math.abs(y - this.base.getY()) <= 2) {
                incorrect = false;
            }
        }
        result.add(x);
        result.add(y);
        return result;
    }

    public abstract BaseCell createBase(int x, int y);

    public void setBase(BaseCell base) {
        this.base = base;
    }

    public void setFarm(FarmCell farm) {
        this.farms.add(farm);
    }

    public FarmCell buyFarm() {
        if (this.money < FarmCell.FARM_COST)
            return null;
        ArrayList<Integer> coordinates = this.chooseFarmLocation();
        this.setFarm(this.base.createFarm(coordinates.get(0), coordinates.get(1)));
        Main.field.setCell(this.farms.get(this.farms.size() - 1));
        return this.farms.get(this.farms.size() - 1);
    }

}
