package Day14_Recap;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the total number of shares you have");
        int totalshares = scan.nextInt();
        if(totalshares > 0) {
            System.out.println("Enter the total value of your shares");
            double value = scan.nextDouble();
            scan.nextLine();//Enter, this clears up space in the scanner so that it will be able to take
                            // the company name.
            System.out.println("Enter the company that has the most shares");
            String comp = scan.nextLine();

            System.out.println("Your total stock market holding is "+value+" which is made up of "+totalshares+
                    " shares. "+comp+" is your company holdings");

        }else {
            System.out.println("Invalid Number");
        }
        scan.close();

    }
}
/*
 2. Stock market
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
You do not have permission to send messages in this channel.

 */

