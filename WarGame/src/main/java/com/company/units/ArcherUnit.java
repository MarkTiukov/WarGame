package com.company.units;

public abstract class ArcherUnit implements Unit {
    protected int X;
    protected int Y;
    protected String typeId = UnitsTypes.ARCHER_ID;
    protected int id;
    protected int health = 50;

    public ArcherUnit() {
    }

    public void printId() {
        System.out.println(this.typeId);
    }
}
