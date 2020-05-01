package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Images {
    public static BufferedImage empty1;
    public static BufferedImage empty2;
    public static BufferedImage empty3;
    public static BufferedImage human_base;
    public static BufferedImage animal_base;


    public static void importPictures() {
        File curDir = new File("");
        String location = curDir.getAbsolutePath().substring(0, curDir.getAbsolutePath().lastIndexOf("WarGame") + "WarGame".length()) + "/static";
        try {
            empty1 = ImageIO.read(new File(location + "/emptycells/Empty1.png"));
            empty2 = ImageIO.read(new File(location + "/emptycells/Empty2.png"));
            empty3 = ImageIO.read(new File(location + "/emptycells/Empty3.png"));
        } catch (IOException e) {
            System.out.println("<ERROR> CANNOT IMPORT A PICTURE OF EMPTY CELL");
        }
        try {
            human_base = ImageIO.read(new File(location + "/bases/HumanBase.png"));
            animal_base = ImageIO.read(new File(location + "/bases/AnimalBase.png"));
        } catch (IOException e) {
            System.out.println("<ERROR> CANNOT IMPORT A PICTURE OF BASE CELL");
        }
    }
}