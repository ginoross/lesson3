package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int oddEven = 0;
        System.out.println("Please enter a number: ");
        oddEven = input.nextInt();
        if (oddEven % 2 == 0) {
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
    }
}
