package com.company.units;

public class MonkeyUnit extends ArcherUnit {


    public MonkeyUnit() {
        super();
        this.typeId = UnitsTypes.MONKEY_ID;
    }

    public MonkeyUnit(int X, int Y, int id) {
        this();
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        this.X = x;
        this.Y = y;
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
