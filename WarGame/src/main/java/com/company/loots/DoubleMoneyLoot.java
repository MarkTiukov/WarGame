package com.company.loots;

public class DoubleMoneyLoot extends Loot {

    public static final int MIN_VALUE = 400;
    public static final int MAX_VALUE = 1000;


    protected int value;

    public DoubleMoneyLoot(int value) {
        super(Loot.DOUBLE_MONEY_LOOT);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
