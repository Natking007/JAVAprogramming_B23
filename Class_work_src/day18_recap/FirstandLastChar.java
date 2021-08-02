package day18_recap;

import java.util.Scanner;

public class FirstandLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1= scan.next();
        String word2 = scan.next();
    }
}
/*
. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
