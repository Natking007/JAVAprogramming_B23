package Day13;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Miles");
        double miles = scan.nextDouble();
        double kilometer = miles * 1.60934;
        if( miles >= 0){
            System.out.println(miles + " miles " +" is :"+ kilometer+" kilometers");

        }else {
            System.out.println("Invalid");
        }
    }
}
/* Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */
