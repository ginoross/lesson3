package com.company;

import java.util.Scanner;

public class timesTables {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timesNum = 0;

        System.out.println("Enter a number");
        timesNum = input.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " times " + timesNum + " = " + timesNum * (i + 1));


        }


    }

}






