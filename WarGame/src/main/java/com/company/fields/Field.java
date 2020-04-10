package com.company.fields;

import com.company.cells.Cell;
import com.company.cells.EmptyCell;
import com.company.loots.Loot;

public class Field {
    public static final int widthForConsole = 6;
    public Cell[][] map;
    private int size; // number of cells in width=height, minimum 12!!!

    public Field() {
        this.size = 0;
    }

    public Field(int size) {
        this.size = size;
        this.map = new Cell[this.size][this.size];
        ////////
        for (int i = 0; i < this.size; ++i) {
            for (int j = 0; j < this.size; ++j) {
                this.map[i][j] = new EmptyCell(i, j);
            }
        }
    }

    public final void draw() {
        for (int i = 0; i < this.size; ++i) {
            for (int j = 0; j < this.size; ++j) {
                this.map[i][j].draw();
            }
        }
    }

    public final void drawInConsole() {
        for (int i = 0; i < this.size; ++i) {
            for (int j = 0; j < this.size; ++j) {
                this.map[i][j].drawInConsole();
            }
            System.out.println();
        }
    }

    public void setCell(Cell cell) {
        this.map[cell.getX()][cell.getY()] = cell;
    }

    public final int getSize() {
        return size;
    }

    public boolean isCellEmpty(int x, int y) {
        return this.map[x][y] instanceof EmptyCell;
    }

    public void setLoot(int x, int y, Loot loot) {
        ((EmptyCell) this.map[x][y]).setLoot(loot);
    }

}
