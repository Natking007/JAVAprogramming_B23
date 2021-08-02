package Strings;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int middleone = word.length() / 2;
        String middleword = "";

        if (word.length() < 5) {

            System.out.println("Invalid");

        } else if (word.length() % 2 != 0 && word.length() >= 5) {

            System.out.print(word.charAt(middleone-1));
            System.out.print(word.charAt(middleone ));
            System.out.print(word.charAt(middleone + 1));


        }
    }
}
