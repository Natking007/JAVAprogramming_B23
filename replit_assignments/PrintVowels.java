import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        for (int i = 0; i <userInput.length() ; i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' ||
                    userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' ||
                    userInput.charAt(i) == 'u')
                System.out.println(i);// this will print out the number since char at returns number
                System.out.println(userInput.charAt(i)+"");// if we concatenate it with an empty string
                                                     // it will print the letter.

        }

    }


    }

/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue

Output: ueueueue

 */
