package Strings;

import java.util.Scanner;

public class PrintLast {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.charAt(word.length()-1));
    }
}
/*
Write a program that will print out last letter of the word (string).

Ex:

Input: java
Input: java
Output: a
 */
