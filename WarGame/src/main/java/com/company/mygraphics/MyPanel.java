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
                g.drawImage(Images.empty2, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case EMPTY3:
                g.drawImage(Images.empty3, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case HumanBase:
                g.drawImage(Images.human_base, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case AnimalBase:
                g.drawImage(Images.animal_base, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
        }
    }
}
