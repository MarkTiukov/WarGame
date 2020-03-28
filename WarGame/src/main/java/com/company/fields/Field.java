package com.company.fields;

import com.company.cells.Cell;

public class Field {
    private int size; // number of cells in width=height, minimum 12!!!
    private Cell[][] map;

    public Field() {
        this.size = 0;
    }

    public Field(int size) {
        this.size = size;
        this.map = new Cell[this.size][this.size];
    }

    public final void draw() {

    }

    public void addCell(int x, int y) {

    }

    public final int getSize() {
        return size;
    }
}
