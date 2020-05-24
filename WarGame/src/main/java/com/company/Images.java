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
    public static BufferedImage end_turn;

    private static void loadEmptyCells(String location) {
        location += "/emptycells";
        try {
            empty1 = ImageIO.read(new File(location + "/Empty1.png"));
            empty2 = ImageIO.read(new File(location + "/Empty2.png"));
            empty3 = ImageIO.read(new File(location + "/Empty3.png"));
        } catch (IOException e) {
            System.out.println("<ERROR> CANNOT IMPORT A PICTURE OF EMPTY CELL");
        }
    }

    private static void loadBaseCells(String location) {
        location += "/bases";
        try {
            human_base = ImageIO.read(new File(location + "/HumanBase.png"));
            animal_base = ImageIO.read(new File(location + "/AnimalBase.png"));
        } catch (IOException e) {
            System.out.println("<ERROR> CANNOT IMPORT A PICTURE OF BASE CELL");
        }
    }

    private static void loadMenuImages(String location) {
        location += "/menu";
        try {
            end_turn = ImageIO.read(new File(location + "/EndTurn.png"));
        } catch (IOException e) {
            System.out.println("<ERROR> CANNOT IMPORT A PICTURE FOR ENDING TURN");
        }
    }

    public static void importPictures() {
        File curDir = new File("");
        String location = curDir.getAbsolutePath().substring(0, curDir.getAbsolutePath().lastIndexOf("WarGame") + "WarGame".length()) + "/static";
        loadEmptyCells(location);
        loadBaseCells(location);
        loadMenuImages(location);
    }
}