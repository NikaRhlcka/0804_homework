package com.company;

import java.util.Scanner;

public class OddNumberCalculator {
    /* Write a program that takes a positive integer from the user - number (int),
     and then prints all positive odd numbers not greater than the given number in the console in order,
     each number in new line.
     For example, for the number 15, the program should write in the console
     the numbers: 1, 3, 5, 7, 9, 11, 13, 15 (in new line each).
     Get the data from the user in the console using the Scanner class.
     */
    void OddCalc() {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input random number");
        int number = scanner.nextInt();

        for (i = 1; i <= number; i=i+2) {
            System.out.println(i);
        }
    }
}
