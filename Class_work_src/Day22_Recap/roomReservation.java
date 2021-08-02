package Day22_Recap;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswer = "";
        String bedType = "";
        int totalPrice = 0;

        System.out.println("Welcome to cybertek hotel");
        System.out.println("Did you want to reserve a bedroom");
        userAnswer = scan.next();

        while ((userAnswer.equalsIgnoreCase("yes"))){
        System.out.println("Which bed did you want?");
            bedType = scan.next();
            if (bedType.equalsIgnoreCase("king bed")) {
                totalPrice += 120;
                System.out.println(bedType + totalPrice);
            }
            if (bedType.equalsIgnoreCase("Queen Bed")) {
                totalPrice += 100;

            }  if (bedType.equalsIgnoreCase("Single bed")) {
                totalPrice += 80;

            } else{
                System.out.println("Invalid room choice");
            }

        } while (!(userAnswer.equalsIgnoreCase("yes"))) {
                System.out.println("Invalid entry,please re-enter!Do you want to reserve another room");
                userAnswer = scan.next();
                if ((userAnswer.equalsIgnoreCase("no"))) {
                    System.out.println("Alright thank for using our service");
                    System.out.println("Your total price is:" + totalPrice);
                }
            }
        System.out.println("Your total price is: "+totalPrice);
        }
    }

/*
write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program asks the user which bedroom does he/she wants to reserve and
calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
 */