package com.company.loots;

public abstract class Loot {

    public static final String MONEY_LOOT = "money";
    public static final String DOUBLE_MONEY_LOOT = "double money";

    protected String type;

    public Loot(String type) {
        this.type = type;
    }

    public final String getType() {
        return this.type;
    }
    public abstract int getValue();

}
