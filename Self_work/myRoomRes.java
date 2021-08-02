import java.util.Scanner;

public class myRoomRes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bedType = "";
        int totalPrice = 0;
        System.out.print("Welcome to cybertek hotel");
        System.out.println("\n" + "Do you want to reserve a room");
        String userAnswer = scan.next();

        if (((userAnswer.equalsIgnoreCase("yes")))) {
            System.out.println("Which bed type did you want?");
            bedType = scan.next();
        }
        while (bedType.equalsIgnoreCase("King bed")) {
            totalPrice += 120;
            System.out.println("Your total is: " + totalPrice);
        }
        while (bedType.equalsIgnoreCase("Queen")) {
            totalPrice += 100;
            System.out.println("Your total is: " + totalPrice);
        }
        while (bedType.equalsIgnoreCase("Single")) {
            totalPrice += 80;
            System.out.println("Your total is: " + totalPrice);
        }

        if (!(bedType.equalsIgnoreCase("single bed") ||
                (!(bedType.equalsIgnoreCase("king bed") ||
                        (!(bedType.equalsIgnoreCase("queen bed"))))))) {
            System.out.println("Invalid bed selection");
        }

        System.out.println("Do you want to chose another bed type");
        scan.next();

        do {
            System.out.println("thanks");
            break;
        } while (userAnswer.equalsIgnoreCase("no"));
        System.out.println("Total price is:" + totalPrice + bedType);
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
