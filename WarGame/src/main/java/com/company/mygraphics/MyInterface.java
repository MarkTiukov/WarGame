package com.company.mygraphics;

import com.company.Images;
import com.company.Main;
import com.company.cells.AnimalBaseCell;
import com.company.cells.BaseCell;
import com.company.cells.HumanBaseCell;
import com.company.fields.Field;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInterface implements Interfacable {
    //TODO make scrollable
    private static final int windowSizeY = 900;
    private static final int controlMenuWidth = 70;
    private static final int windowSizeX = windowSizeY + controlMenuWidth;

    private final JFrame window = new JFrame("War Game");

    private MyPanel[][] map;

    public MyInterface() {
        this.window.setResizable(false);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(windowSizeX + 10, windowSizeY + 10);
        this.window.setLayout(null);
        this.window.setLocationRelativeTo(null);
    }

    @Override
    public void showEndTurnMsg(String newPlayer) {
        JOptionPane.showMessageDialog(null, "The move goes to " + newPlayer);
    }

    @Override
    public void showWindow() {
        this.window.setVisible(true);
    }

    @Override
    public void drawMenu() {
        JButton endTurnButton = new JButton("");
        endTurnButton.setIcon(new ImageIcon(Images.end_turn.getScaledInstance(controlMenuWidth, controlMenuWidth, java.awt.Image.SCALE_SMOOTH)));
        endTurnButton.setBounds(windowSizeX - controlMenuWidth, windowSizeY - controlMenuWidth - 10, controlMenuWidth, controlMenuWidth);
        endTurnButton.addActionListener(e -> {
            System.out.println("Clicked");
            Main.judge.finishMove();
        });
        this.window.getContentPane().add(endTurnButton);
    }

    @Override
    public void drawInitialMap(Field field) {
        int numberOfCells = field.getSize();
        int cellSize = (windowSizeY - 4) / numberOfCells;
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
                            System.out.println("<ERROR> undefined cell");
                        }
                    }
                } else {
                    this.map[i][j] = new MyPanel(Pictures.getRandomEmpty());
                }
                this.map[i][j].setBounds(i * cellSize, j * cellSize, cellSize, cellSize);
                this.map[i][j].setName(i + "" + j);
                this.window.getContentPane().add(this.map[i][j]);
            }
        }
        drawMenu();
    }

}
