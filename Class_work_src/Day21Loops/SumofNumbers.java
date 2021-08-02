package Day21Loops;

import java.util.Scanner;
/*
 if you don't know the number of iterations you are required to have
 you use while loops but if you want the condition to run a certain
 number of times you use for loops. The if statement in a while loop
 controls the amount of iteration by setting a limit because the while loop
  will keep running as long as condition is true right
 */

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){ // this means "while the user enters number above 0 execute the following statement"?
            System.out.println("Enter a number:");
            int n = scan.nextInt();
            if(n < 0){ // if user entered negative number
                break; // exits the loop
            }else {
                sum += n;

        }
        }
    }
}
