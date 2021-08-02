package Day12_Scanner;

import java.util.Scanner;

public class EligibletobuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter you age");
        int age = input.nextInt();// since the age is an integer the method name
                                  // will be "input.nextInt so that the scanner class
                                  // can accept int values

        if(age >= 21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("get out!");
        }

    }
}
