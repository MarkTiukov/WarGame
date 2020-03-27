package com.company.fields;

import com.company.Cell;

public class Field {
    private int size; // number of cells in width=height
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

}
