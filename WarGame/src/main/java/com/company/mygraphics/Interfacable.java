package com.company.mygraphics;

import com.company.cells.Cell;
import com.company.fields.Field;

public interface Interfacable {
    void showWindow();

    void drawMenu();

    void drawInitialMap(Field field);

    void drawMap();

    void showEndTurnMsg(String newPlayer);

    void setCell(Cell cell, int x, int y);
}
