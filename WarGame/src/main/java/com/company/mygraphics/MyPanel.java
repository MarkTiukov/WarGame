package com.company.mygraphics;

import com.company.Images;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    //TODO add error picture (for some strange wrong cells

    private Pictures name;

    MyPanel() {
    }

    public void change(Pictures newPicture) {
        this.name = newPicture;
        this.repaint();
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
            case HumanFarm:
                g.drawImage(Images.humanFarm, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case AnimalFarm:
                g.drawImage(Images.animalFarm, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case HumanBase:
                g.drawImage(Images.humanBase, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            case AnimalBase:
                g.drawImage(Images.animalBase, 0, 0, this.getWidth(), this.getHeight(), this);
                break;
            default:

        }
    }
}
