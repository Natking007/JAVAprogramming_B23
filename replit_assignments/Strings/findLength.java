package Strings;

import java.util.Scanner;

public class findLength {
    public static void main(String[] args) {
        System.out.println("Please enter text");

        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        System.out.println(userInput.length());


    }
}
/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java
input: java
Display message: "Length is: 4"
 */