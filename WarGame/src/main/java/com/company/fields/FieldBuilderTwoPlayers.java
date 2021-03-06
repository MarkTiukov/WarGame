package com.company.fields;

import com.company.cells.BaseCell;
import com.company.fractions.Fraction;
import com.company.loots.DoubleMoneyLoot;
import com.company.loots.MoneyLoot;

import java.util.Random;

public class FieldBuilderTwoPlayers implements FieldBuilder {
    private static final int chanceToGenerateLoot = 5; // chances to generate loo at a separate cell is 1 / <this constant>
    Fraction[] fractions;
    private Random random;
    private Field field;

    public FieldBuilderTwoPlayers(int size, Fraction[] fractionsId) {
        this.field = new Field(size);
        this.fractions = fractionsId;
        this.random = new Random();
    }

    @Override
    public void generateLoot() {
        for (int i = 0; i < this.field.getSize(); ++i) {
            for (int j = 0; j < this.field.getSize(); ++j) {
                if (this.field.isCellEmpty(i, j) && this.random.nextInt(FieldBuilderTwoPlayers.chanceToGenerateLoot) == 0) {
                    int nextInt = this.random.nextInt(5);// 4 for money, 1 for double money
                    if (nextInt < 4) {
                        this.field.setLoot(i, j, new MoneyLoot(this.random.nextInt(MoneyLoot.MAX_VALUE - MoneyLoot.MIN_VALUE) + MoneyLoot.MIN_VALUE));
                    } else if (nextInt == 4) {
                        this.field.setLoot(i, j, new DoubleMoneyLoot(this.random.nextInt(DoubleMoneyLoot.MAX_VALUE - DoubleMoneyLoot.MIN_VALUE) + DoubleMoneyLoot.MIN_VALUE));
                    } else {
                        System.out.println("<ERROR> something went wrong in genarateLoot() in FuildBuilderTwoPlayers");
                    }
                }
            }
        }
    }

    public int getFirstBaseX() {
        return 1 + this.random.nextInt(this.field.getSize() / 3);
    }

    public int getFirstBaseY() {
        return 1 + this.random.nextInt(this.field.getSize() / 3);
    }

    public int getSecondBaseX() {
        return this.field.getSize() - 2 - this.random.nextInt(this.field.getSize() / 3);
    }

    public int getSecondBaseY() {
        return this.field.getSize() - 2 - this.random.nextInt(this.field.getSize() / 3);
    }

    @Override
    public void generateFractions() {

        int x1 = getFirstBaseX();
        int y1 = getFirstBaseY();

        BaseCell base = this.fractions[0].createBase(x1, y1);
        this.fractions[0].setBase(base);
        this.field.setCell(base);

        int x2 = getSecondBaseX();
        int y2 = getSecondBaseY();

        base = this.fractions[1].createBase(x2, y2);
        this.fractions[1].setBase(base);
        this.field.setCell(base);

    }

    @Override
    public Field getField() {
        generateFractions();
        generateLoot();
        return this.field;
    }

    @Override
    public int getSize() {
        return this.field.getSize();
    }
}
