package Day16;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();// everytime you call scanner method you can only input one word
        String word2 = scan.next();
        // This code has a bug because if the user inputs a string that has only one letter then
        // there will be nothing to print out but we can correct it with a precondition
        if(word1.length()>= 2 && word2.length()>=2) {
            String result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        }else {
            System.out.println("Too short");
        }

    }
}
/*

2. Ask user to enter two words. Print first word without its first character
then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */