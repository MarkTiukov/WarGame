package com.company.units;

public abstract class WarriorUnit implements Unit {
    protected int X = 0;
    protected int Y = 0;
    protected String typeId = UnitsTypes.WARRIOR_ID;
    protected int id = 0;

    public WarriorUnit() {}

    public void printId() {
        System.out.println(this.typeId);
    }
}
