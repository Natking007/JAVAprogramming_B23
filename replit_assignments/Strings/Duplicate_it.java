package Strings;

import java.util.Scanner;

public class Duplicate_it {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        System.out.print(word1.concat(word2));
        System.out.println(word2.concat(word1));
    }
}
/*
You have 2 words

Print the first word, second word, second word, first word

Input:

one

two
Input:

one

two
Output:

onetwotwoone
 */
