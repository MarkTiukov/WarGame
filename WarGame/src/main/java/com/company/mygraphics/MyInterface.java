package com.company.mygraphics;

import com.company.Images;
import com.company.Main;
import com.company.cells.*;
import com.company.fields.Field;

import javax.swing.*;

public class MyInterface implements Interfacable {
    //TODO make scrollable
    private static final int windowSizeY = 900;
    private static final int controlMenuWidth = 70;
    private static final int windowSizeX = windowSizeY + controlMenuWidth;
    private static final String NOT_ENOUGH_MONEY = "You don't have enough money";

    private final JFrame window = new JFrame("War Game");

    private MyPanel[][] map;

    public MyInterface() {
        this.window.setResizable(false);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(windowSizeX + 10, windowSizeY + 10);
        this.window.setLayout(null);
        this.window.setLocationRelativeTo(null);
    }

    public static void showMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
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
        // TODO make a container for the menu
        JButton endTurnButton = new JButton("");
        endTurnButton.setBorderPainted(false);
        endTurnButton.setIcon(new ImageIcon(Images.endTurn.getScaledInstance(controlMenuWidth, controlMenuWidth, java.awt.Image.SCALE_SMOOTH)));
        endTurnButton.setBounds(windowSizeX - controlMenuWidth, windowSizeY - controlMenuWidth - 10, controlMenuWidth, controlMenuWidth);
        endTurnButton.addActionListener(e -> {
            System.out.println("<Ending your move>");
            Main.judge.finishMove();
        });
        this.window.getContentPane().add(endTurnButton);

        JButton buyButton = new JButton("");
        buyButton.setBorderPainted(false);
        buyButton.setIcon(new ImageIcon(Images.buyIcon.getScaledInstance(controlMenuWidth, controlMenuWidth, java.awt.Image.SCALE_SMOOTH)));
        buyButton.setBounds(windowSizeX - controlMenuWidth, windowSizeY - 2 * (controlMenuWidth + 10), controlMenuWidth, controlMenuWidth);
        buyButton.addActionListener(e -> {
            System.out.println("<buying farm>");
            String msg = "";
            FarmCell newFarm = Main.judge.buyFarm();
            if (newFarm != null) {
                showMessage("You successfully bought a farm!");
                this.setCell(newFarm, newFarm.getX(), newFarm.getY());
                Main.field.drawInConsole();
            } else {
                showMessage(NOT_ENOUGH_MONEY);
            }
        });
        this.window.getContentPane().add(buyButton);
    }

    @Override
    public void setCell(Cell cell, int x, int y) {
        // may be visitor here
        if (cell instanceof BaseCell) {
            if (cell instanceof HumanBaseCell) {
                this.map[x][y].change(Pictures.HumanBase);
            } else {
                if (cell instanceof AnimalBaseCell) {
                    this.map[x][y].change(Pictures.AnimalBase);
                } else {
                    System.out.println("<ERROR> undefined base cell");
                }
            }
            return;
        }
        if (cell instanceof FarmCell) {
            if (cell instanceof HumanFarmCell) {
                this.map[x][y].change(Pictures.HumanFarm);
            } else {
                if (cell instanceof AnimalFarmCell) {
                    this.map[x][y].change(Pictures.AnimalFarm);
                } else {
                    System.out.println("<ERROR> undefined base cell");
                }
            }
            return;
        }
        this.map[x][y].change(Pictures.getRandomEmpty());
    }


    @Override
    public void drawInitialMap(Field field) {
        int numberOfCells = field.getSize();
        int cellSize = (windowSizeY - 4) / numberOfCells;
        this.map = new MyPanel[numberOfCells][numberOfCells];
        for (int i = 0; i < numberOfCells; ++i) {
            for (int j = 0; j < numberOfCells; ++j) {
                this.map[i][j] = new MyPanel();
                this.setCell(field.map[i][j], i, j);
                this.map[i][j].setBounds(i * cellSize, j * cellSize, cellSize, cellSize);
                this.map[i][j].setName(i + "" + j);
                this.window.getContentPane().add(this.map[i][j]);
            }
        }
        drawMenu();
    }

    @Override
    public void drawMap() {

    }

}
