package com.company;

import java.util.Scanner;

public class Sequence {
    /* Write a program that takes from the user two integers A - a (int) and B - b (int), where A <B,
     and then calculates the sum of the sequence of numbers from A to B (A, A + 1, A + 2, ..., B)
     and prints it in the console. When the A < B condition is not met, the program exits by writing
     "Job completed" in the console.
     For example, for A = 4 and B = 11, the program should write the number 60 in the console.
     Get the data from the user in the console using the Scanner class.
     */

    public void SecCalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int a = scanner.nextInt();
        System.out.println("Input second number");
        int b = scanner.nextInt();
        int c=0,storage=0,result;

        if(a>b){
            System.out.println("First number should be less than second.");
        }else{
            do{
                result = a + c;
                storage = storage + result;
                c++;
            }while(a+c < b);
        }
        System.out.println(storage+b);
    }
}
