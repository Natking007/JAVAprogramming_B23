import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        for (int i = 0; i <userInput.length() ; i++) {
            String eachLetter = ""+userInput.charAt(i);
            System.out.println(eachLetter);
        }

    }
}
/*
Given a String, use a loop to print every character
from the String on a new line.

Examples:

Input: hello
h
e
l
l
o
Input: hello
h
e
l
l
o
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: wow!
w
o
w
!
 */
