package Day22_Recap;

import java.util.Scanner;

public class DowhilePrac {
    public static void main(String[] args) {
        int n =  0;
        int sumEven = 0;
        int sumOdd = 0;
            do{
                if(n % 2 == 0){
                    sumEven += n;
                }else {
                    sumOdd += n;
                }
                System.out.println(n);
                n++;// this iterator will keep count
        }while(n < 10);
            System.out.println(n);
        System.out.println(sumEven);
        System.out.println(sumOdd);
        /*
Write a program using while loop, that calculates the sum of the even numbers between
0 and 10
 */

        System.out.println("---------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        String userName = "JohnJames";
        String passWord = "John123";
        String u ="";// creating these variables outside of the do block makes them
        String p ="";// local or visible variables that can be used in the while block as well
        do{ // will execute infinitely while the user enters incorrect credentials
            System.out.println("Enter your userName");
             u = scan.next();

            System.out.println("Enter your password");
             p = scan.next();
        }while(!(u.equals(userName) && p.equals(passWord)));// while username and password are incorrect then keep
        System.out.println("Logged in");// repeating the requirement but if user enter correct creds then print out
                                       // logged in

        /*
        Write a program that asks user to enter his/her username and password until user enters
correctly.
         */
    }
}
