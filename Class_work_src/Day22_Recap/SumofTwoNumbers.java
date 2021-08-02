package Day22_Recap;
import java.util.Locale;
import java.util.Scanner;
public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        do{
            System.out.println("Enter two numbers:");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Addition: "+ (n1 + n2));

            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();
                 //this loop below is inside another do-while loop
                // which means this whole loop(solution) is an example of
               // nested loop
         while (! (answer.equals("yes")||answer.equals("no")));{// while the answer is invalid
        System.out.println("Invalid answer, Please re-enter");// then it'll continue to ask "do you want to continue"
        System.out.println("Do you want to continue");
        answer = scan.next().toLowerCase();
         }

        }while (answer.equalsIgnoreCase("yes"));
        scan.close();
}}
/*
1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again

 */