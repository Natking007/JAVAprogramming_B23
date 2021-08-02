package Strings;

import java.util.Scanner;

public class Print_Half_Twice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String halfWord ="";
        halfWord = word.charAt(0) +""+word.charAt(1);
        System.out.println(halfWord+halfWord);
    }
}
