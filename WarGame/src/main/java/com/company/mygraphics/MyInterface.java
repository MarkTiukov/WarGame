package com.company.mygraphics;

import com.company.cells.AnimalBaseCell;
import com.company.cells.BaseCell;
import com.company.cells.HumanBaseCell;
import com.company.fields.Field;

import javax.swing.*;

public class MyInterface implements Interfacable {
    //TODO make scrollable
    private static final int windowSizeY = 1000;
    private static final int controlMenuWidth = 70;
    private static final int windowSizeX = windowSizeY + controlMenuWidth;

    private final JFrame window = new JFrame("War Game");

    private MyPanel[][] map;

    public MyInterface() {
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(windowSizeX, windowSizeY);
        this.window.setLayout(null);
        this.window.setLocationRelativeTo(null);
    }

    @Override
    public void showWindow() {
        this.window.setVisible(true);
    }

    @Override
    public void drawInitialMap(Field field) {
        int numberOfCells = field.getSize();
        int cellSize = (windowSizeY - 2) / numberOfCells;
        this.map = new MyPanel[numberOfCells][numberOfCells];
        for (int i = 0; i < numberOfCells; ++i) {
            for (int j = 0; j < numberOfCells; ++j) {
                if (field.map[i][j] instanceof BaseCell) {
                    if (field.map[i][j] instanceof HumanBaseCell) {
                        this.map[i][j] = new MyPanel(Pictures.HumanBase);
                    } else {
                        if (field.map[i][j] instanceof AnimalBaseCell) {
                            this.map[i][j] = new MyPanel(Pictures.AnimalBase);
                        } else {
                            System.out.println("<ERROR> undefiened cell");
                        }
                    }
                } else
                    this.map[i][j] = new MyPanel(Pictures.getRandomEmpty());
                this.map[i][j].setBounds(i * cellSize, j * cellSize, cellSize, cellSize);
                this.map[i][j].setName(i + "" + j);
                this.window.getContentPane().add(this.map[i][j]);
            }
        }
    }
}
