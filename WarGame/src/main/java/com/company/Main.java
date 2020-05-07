package com.company;

import com.company.fields.Field;
import com.company.fields.FieldBuilder;
import com.company.fields.FieldBuilderTwoPlayers;
import com.company.fractions.AnimalFraction;
import com.company.fractions.Fraction;
import com.company.fractions.FractionsId;
import com.company.fractions.HumanFraction;
import com.company.mygraphics.MyInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // JUnit and Mockito for testing 

    public static final int MIN_FIELD_SIZE = 12;
    public static Fraction[] playableFractions;
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> availableFractons;
    public static Field field;

    public static void main(String[] args) {
        helloWords();
        Images.importPictures();
        while (true) {
            String command = scanner.nextLine();
            if (command.equals(Commands.TUTORIAL)) {
                tutorial();
                continue;
            }
            if (command.equals(Commands.FINISH)) {
                break;
            }
            if (command.equals(Commands.START)) {
                play();
            }
        }
    }

    public static void helloWords() {
        System.out.println("WELCOME TO WAR GAME");
        System.out.println("ARE YOU READY??");
        System.out.println("\n<You can read a tutorial by typing \"" + Commands.TUTORIAL + "\" without quotes>");
        System.out.println("<To start type \"" + Commands.START + "\". To finish and exit type \"" + Commands.FINISH + "\">");
    }

    public static void tutorial() {
        System.out.println("<SORRY, TUTORIAL IS NOT AVAILABLE YET>");
    }

    public static void play() {
        availableFractons = new ArrayList<>();
        FractionsId.addAll(availableFractons);
        chooseNumber();
        chooseFractions();
        FieldBuilder fieldBuilder;
        if (playableFractions.length == 2) {
            fieldBuilder = new FieldBuilderTwoPlayers(chooseSize(), playableFractions);
        } else {
            System.out.println("<ERROR WITH NUMBER OF PLAYERS>");
            return;
        }
        MyInterface myInterface = new MyInterface();
        field = fieldBuilder.getField();
        field.drawInConsole();
        myInterface.drawInitialMap(field);
        myInterface.showWindow();
    }

    public static void chooseNumber() {
        System.out.println("<PLease, choose number of players: " + "2" + ">");
        playableFractions = new Fraction[scanner.nextInt()];
        scanner.nextLine();
    }

    public static void chooseFractions() {
        System.out.println("<Please, choose your fraction from available>");
        for (int i = 0; i < playableFractions.length; ++i) {
            printAvailableFractions();
            String name = scanner.nextLine();
            if (!availableFractons.remove(name.toUpperCase())) {
                --i;
                System.out.println("<wrong fraction name>");
            }
            if (name.equals(FractionsId.ANIMALS_ID.toLowerCase())) {
                playableFractions[i] = new AnimalFraction();
            }
            if (name.equals(FractionsId.PEOPLE_ID.toLowerCase())) {
                playableFractions[i] = new HumanFraction();
            }
        }
    }

    public static void printAvailableFractions() {
        System.out.print("<Available fractions:");
        for (String s : availableFractons) {
            System.out.print(" " + s.toLowerCase());
        }
        System.out.println(">");
    }

    public static int chooseSize() {
        System.out.println(String.format("<Choose map size (minimum %s)>", MIN_FIELD_SIZE));
        int result = scanner.nextInt();
        while (result < MIN_FIELD_SIZE) {
            System.out.println(String.format("<Size should be more than %s, choose new>", MIN_FIELD_SIZE));
            result = scanner.nextInt();
        }
        return result;
    }

}
