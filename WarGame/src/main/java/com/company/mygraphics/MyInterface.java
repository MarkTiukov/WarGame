package com.company.mygraphics;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyInterface implements Interfacable {
    private static final int windowSize = 1000;

    private JFrame window = new JFrame("War Game");

    private MyPanel[][] map;

    public MyInterface() {
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(windowSize, windowSize);
        this.window.setLayout(null);
    }

    @Override
    public void showWindow() {
        this.window.setVisible(true);
    }

    @Override
    public void drawInitialMap(int numberOfCells) {
        int cellSize = (windowSize - 2) / numberOfCells;
        this.map = new MyPanel[numberOfCells][numberOfCells];
        Random random = new Random();
        for (int i = 0; i < numberOfCells; ++i) {
            for (int j = 0; j < numberOfCells; ++j) {
                this.map[i][j] = new MyPanel(Pictures.getRandomEmpty());
                this.map[i][j].setBounds(i * cellSize, j * cellSize, cellSize, cellSize);
                this.map[i][j].setName(i + "" + j);
                this.window.getContentPane().add(this.map[i][j]);
            }
        }
        this.map[1][0].setBackground(Color.blue);
    }
}
