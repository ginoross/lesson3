package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RandTally {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int diceSides = 0;
        int diceThrows = 0;
        int totalDice = 0;
        int v = 0;
        Map<Integer, Integer> Tally = new HashMap<Integer, Integer>();

        System.out.println("How many sides do you want your dice to have: ");
        diceSides = input.nextInt();
        System.out.println("How many times do you want to throw your dice: ");
        diceThrows = input.nextInt();


        for (int i = 1; i < diceSides; i++) {
            Tally.put(i,v);

        }

        for (int i = 0; i < diceThrows; i++) {
            int newRandom = random.nextInt(diceSides - 1);
            newRandom = newRandom + 1;
            Tally.replace(newRandom,v+=1);


            totalDice = totalDice + newRandom;

        }
        System.out.println("Total" + totalDice);
        System.out.println(Tally.get(1));
        System.out.println(Tally.get(2));
        System.out.println(Tally.get(3));
        System.out.println(Tally.get(4));


    }
}
