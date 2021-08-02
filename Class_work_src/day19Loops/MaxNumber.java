package day19Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max= -2147483648;// whatever the user enters it cant be smaller than this
        // after 1st execution max is whatever that is entered
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();
            if(n > max){ //if the user entered a number greater than max
                max = n;// then users number will be assigned greater number
            }

        }
        System.out.println("max = "+max);
    }
}
