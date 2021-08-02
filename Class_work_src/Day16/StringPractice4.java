package Day16;

import java.util.Scanner;

public class StringPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        boolean allSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean notSame = word1.length() != word2.length() && word2.length() != word3.length() &&
                word1.length() != word3.length();
        if(allSame){
            System.out.println("all words are the same");
        }else if(notSame){
            System.out.println("All different length");
        }else{
            System.out.println("Not same nor different lengths");
        }
        scan.close();
    }
}
/*

3. write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'. In the case it is print: "Cool word",
but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
            - If the word is less than 3 letters: "Word is too short"
           -  If the word is too long: "Word is too long"
 */