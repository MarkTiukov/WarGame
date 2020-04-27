package com.company.units;

public class RiflemanUnit extends ArcherUnit {

    public RiflemanUnit() {
        super();
        this.typeId = UnitsTypes.RIFLEMAN_ID;
    }

    public RiflemanUnit(int X, int Y, int id) {
        this();
        this.id = id;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void draw() {
        System.out.println(this.typeId + " is at cell with x == " + this.X + " and with y == " + this.Y);
    }
}
