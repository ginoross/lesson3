package com.company;

import java.util.Scanner;

public class numberTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loopNum = 0;

        System.out.println("Please enter a number: ");
        loopNum = input.nextInt();

        for (int i = 0; i < (loopNum + 1); i++) {
            System.out.println("");
            for (int j = 1; j < (i + 1); j++) {
                System.out.print(j);

            }
        }
        for (int i = (loopNum - 1); i > 0; i--) {
            System.out.println("");
            for (int j = 1; j < (i + 1); j++) {
                System.out.print(j);
            }


        }
    }

}