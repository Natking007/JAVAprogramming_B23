package Day22_Recap;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        char operator;
        String userAnswer = "";

        //while (userAnswer.equalsIgnoreCase("yes")){
        while (!userAnswer.equalsIgnoreCase("no")) {
            System.out.println("Enter two numbers");
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            System.out.println("Enter a math operator");
            operator = scan.next().charAt(0);  // this is to accept a char data type

            if (operator == '-') {
                System.out.println("Subtraction: " + (num1 - num2));
            } else if (operator == '+') {
                System.out.println("Addition: " + (num1 + num2));
            } else if (operator == '*') {
                System.out.println("Multiplication: " + (num1 * num2));
            } else if (operator == '/') {
                System.out.println("Division:" + (num1 / num2));
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("do you want to continue");
            userAnswer = scan.next();

            while ((userAnswer.equalsIgnoreCase("yes"))) {
                //to make sure  that the user will enter yes or no
                System.out.println("Invalid entry, please enter! Do you want to continue?");
                userAnswer = scan.next();
            }
            while(userAnswer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using calculator"+"\n"+"GOODBYE");
                System.exit(0);
            }

        }
    }
    }

