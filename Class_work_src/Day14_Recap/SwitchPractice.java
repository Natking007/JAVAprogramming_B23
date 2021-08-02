package Day14_Recap;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many people live with you");
        int numberOfpeopl = scan.nextInt();

        if (numberOfpeopl >= 1){
            switch(numberOfpeopl) {// in this way I avoid creating a local
                // variable to hold the value of the user input
                case 1:
                case 2:
                    System.out.println("Live with less than 3 people");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("live with 3-6 people");
                    break;
                default:
                    System.out.println("Live with more than 6 people");

            } }else{
            System.out.println("Invalid Number");
        }



    }
    }

        /*
        // short numberOfpeople = scan.nextShort();
        // another method to write line 9 would be
        switch(scan.nextShort()) {// in this way I avoid creating a local
                              // variable to hold the value of the user input
            case 1:
            case 2:
                System.out.println("Live with less than 3 people");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("live with 3-6 people");
                break;
            default:
                System.out.println("Live with more than 6 people");

         */

