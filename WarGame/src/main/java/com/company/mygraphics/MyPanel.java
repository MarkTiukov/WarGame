package com.company.mygraphics;

import com.company.Images;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    private Pictures name;

    MyPanel() {
    }

    MyPanel(Pictures name) {
        this.name = name;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (this.name) {
            case EMPTY1:
                g.drawImage(Images.empty1, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case EMPTY2:
                break;
            case EMPTY3:
                break;
        }
    }
}
