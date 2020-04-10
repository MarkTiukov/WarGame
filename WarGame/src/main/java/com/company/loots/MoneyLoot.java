package com.company.loots;

public class MoneyLoot extends Loot {

    public static final int MIN_VALUE = 10;
    public static final int MAX_VALUE = 200;


    protected int value;


    public MoneyLoot(int value) {
        super(Loot.MONEY_LOOT);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
