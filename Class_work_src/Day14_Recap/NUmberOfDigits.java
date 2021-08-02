package Day14_Recap;

import java.util.Scanner;

public class NUmberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 10000:");
        int n = scan.nextInt();
        scan.close();// When the compiler goes to check the statements below
                     // closing the scanner will have better performance
                     // since leaving it open will leave it operating in the background
                     // taking more memory
        String result = " ";
        if(n>=1 && n <= 100000){ // validation process
            if(n<= 9){
                result=("1 digit");
            }else if(n <= 99){
                result=("2 digits");
            }else if(n <= 999){
                result=("3 digits");
            }else if( n <= 9999){
                result=("4 digits");
            }else if( n <= 99999){
                result=("5 digits");
            }else {
                result=("6 digits");
            }

        }else{
            result=("Invalid number");
        }
        // Ternary form would be
        /*
        String result2 = (n >= 1 && n<= 999999)? <---- this is the precondition
                         (n <= 9) ? "1 digit" :( n <= 99) ? "2 digits"
                         :(n <= 999)? "3 digits" :( n <= 9999)? "4 digits" :( n <= 99999)?:"5 digits"
                         :"6 digits" : "Invalid";
         */
    }
}
