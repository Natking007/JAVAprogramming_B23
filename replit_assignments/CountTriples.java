import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wordCounter = 0;
        String userInput = scan.nextLine();
        for (int i = 0; i <= userInput.length()-3; i++) {
            String eachLetter = ""+ userInput.charAt(i)+userInput.charAt(i)+
             userInput.charAt(i);
            if(eachLetter.equals(userInput.substring(i,i+3))){
                wordCounter++;
            }

        }
        System.out.println(wordCounter);
    }
}
/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
copied!
input: xxxabyyyycd

output: 3
Example:

input: java

output: 0
 */
