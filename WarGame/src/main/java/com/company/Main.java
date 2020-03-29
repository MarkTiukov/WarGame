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
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class Main {

    public static Fraction playableFractions[];
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> availableFractons;

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
    }

    public static void chooseNumber() {
        System.out.println("<PLease, choose number of players: " + "2" + ">" );
        playableFractions = new Fraction[scanner.nextInt()];
    }

    public static void chooseFractions() {
        System.out.print("<Please, choose your fraction from available>");
        System.out.println("<Available fractions:>");

    }

}
