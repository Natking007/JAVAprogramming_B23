package day19Loops;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverseWord = "";
        for (int i =word.length()-1 ; i >=0 ; i--) {
            reverseWord += word.charAt(i);

        }
        boolean isPlaindrome = word.equalsIgnoreCase(reverseWord);
        if (isPlaindrome){
            System.out.println(word +" is a plindrome");
        }else{
            System.out.println(word+" is not palindrom");
        }
    }
}
