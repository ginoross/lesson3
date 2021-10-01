package com.company;

import java.util.Random;
import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {


//        System.out.println("First random int is " + random.nextInt(10));
//        System.out.println("First random double is " + random.nextDouble());
//
//        System.out.println(Math.random());
//
//        int rand = (int)(Math.random()*10);
//        System.out.println(rand);

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int loopNum = 0;

        System.out.println("How many numbers do you want: ");
        loopNum = input.nextInt();
        System.out.println("Enter the minimum value: ");
        min = input.nextInt();
        System.out.println("Enter the maximum value");
        max = input.nextInt();

        for (int i = 0; i < loopNum; i++) {
            int newRandom = random.nextInt((max - min) + 1) + min;
            System.out.println(newRandom);
        }





    }
}
