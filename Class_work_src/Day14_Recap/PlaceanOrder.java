package Day14_Recap;

import java.util.Scanner;

public class PlaceanOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = scan.nextLine();
        System.out.println("Enter the price");
        double price = scan.nextDouble();
        System.out.println("enter the quantity");
        int quantity = scan.nextInt();
        double totalPrice = price * quantity;
        scan.nextLine();//EnterEnter
        System.out.println("Enter your first name:");
        String firstName = scan.next();// If I change this to nextLine it will allow me to write full name

        scan.close();//closes the scanner object, can not use the scanner after this line. Use this after
                     // receiving all the input. For better performance. Its not mandatory but highly recommended
        System.out.println(firstName+ ", your order for "+quantity+" "+productName+
        " has been placed. Your total is $" + totalPrice);

    }
}
/*
 1. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
