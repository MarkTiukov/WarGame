package com.company.mygraphics;

import com.company.fields.Field;

public interface Interfacable {
    void showWindow();

    void drawMenu();

    void drawInitialMap(Field field);

    void showEndTurnMsg(String newPlayer);

}
