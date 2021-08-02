package Strings;

import java.util.Scanner;

public class PrintFirst_Last {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.print(userInput.charAt(0));
        System.out.println(userInput.charAt(userInput.length()-1));
    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe
Input: adobe
Output: ae
 */