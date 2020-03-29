package com.company;

import com.company.fields.Field;
import com.company.fields.FieldBuilder;
import com.company.fields.FieldBuilderTwoPlayers;
import com.company.fractions.AnimalFraction;
import com.company.fractions.Fraction;
import com.company.fractions.FractionsId;
import com.company.fractions.HumanFraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Fraction playableFractions[];
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> availableFractons;
    public static Field field;


    public static void main(String[] args) {
        helloWords();
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
        /*
        playableFractions = new Fraction[2];
        playableFractions[0] = new HumanFraction();
        playableFractions[1] = new AnimalFraction();
        String[] ids = new String[2];
        ids[0] = FractionsId.PEOPLE_ID;
        ids[1] = FractionsId.ANIMALS_ID;
        FieldBuilder fieldBuilder = new FieldBuilderTwoPlayers(12, ids);
        fieldBuilder.generateFractions();
        Field field = fieldBuilder.getField();
        field.drawInConsole();
         */
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
        availableFractons = new ArrayList<String>();
        FractionsId.addAll(availableFractons);
        chooseNumber();
        chooseFractions();
        FieldBuilder fieldBuilder;
        switch (playableFractions.length) {
            case 2:
                fieldBuilder = new FieldBuilderTwoPlayers(chooseSize(), playableFractions);
                break;
            default:
                System.out.println("<ERROR WITH NUMBER OF PLAYERS>");
                return;
        }
        field = fieldBuilder.getField();
        field.drawInConsole();
    }

    public static void chooseNumber() {
        System.out.println("<PLease, choose number of players: " + "2" + ">");
        playableFractions = new Fraction[scanner.nextInt()];
        scanner.nextLine();
    }

    public static void chooseFractions() {
        System.out.println("<Please, choose your fraction from available>");
        System.out.print("<Available fractions:");
        for (String s : availableFractons) {
            System.out.print(" " + s.toLowerCase());
        }
        System.out.println(">");
        for (int i = 0; i < playableFractions.length; ++i) {
            String name = scanner.nextLine();
            availableFractons.remove(name.toUpperCase());
            if (name.equals(FractionsId.ANIMALS_ID.toLowerCase())) {
                playableFractions[i] = new AnimalFraction();
            }
            if (name.equals(FractionsId.PEOPLE_ID.toLowerCase())) {
                playableFractions[i] = new HumanFraction();
            }
            System.out.print("<Available fractions:");
            for (String s : availableFractons) {
                System.out.print(" " + s.toLowerCase());
            }
            System.out.println(">");
        }
    }

    public static int chooseSize() {
        System.out.println("<Choose map size (minimum 12)>");
        int result = scanner.nextInt();
        while (result < 12) {
            System.out.println("<Size should be more than 12, choose new>");
            result = scanner.nextInt();
        }
        return result;
    }

}
