package Strings;

import java.util.Scanner;

public class Verify_Contiains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
       // if(sentence.contains(word)){
         //   boolean isContains = sentence.contains(word);
           // System.out.println(isContains);
        // } else{
          //  System.out.println("False");
        //}
        boolean isContains = sentence.contains(word);
        System.out.println(isContains);


    }
}
/*
Write a program that will verify if the **sentence**
 contains **word**.
 Print out the result as a boolean value.
 */