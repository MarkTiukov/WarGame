package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Images {
    public static BufferedImage empty1;
    public static BufferedImage empty2;
    public static BufferedImage empty3;

    public static void importPictures() {
        try {
            empty1 = ImageIO.read(new File("static/emptycells/Empty1.png"));
            empty2 = ImageIO.read(new File("static/emptycells/Empty2.png"));
            empty3 = ImageIO.read(new File("static/emptycells/Empty3.png"));
        } catch (IOException e) {
            System.out.println("CANNOT IMPORT A PICTURE");
        }
    }
}