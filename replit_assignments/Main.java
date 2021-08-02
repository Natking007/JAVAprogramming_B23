import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Item1 and its price:");
            double Price1 = scan.nextDouble();
            String Item1 = scan.nextLine();
            System.out.println("Enter Item2 and its price:");
            double Price2 = scan.nextDouble();
            String Item2 = scan.nextLine();
            System.out.println("Enter Item3 and its price:");
            double Price3 = scan.nextDouble();
            String Item3 = scan.nextLine();
            double totalPrice = Price1 + Price2 + Price3;

            System.out.println("Item1" + Item1);
        }
    }
/*
        n this assignment you will write a program to create a shopping list and prices.

        You will use Scanner object and ask user to enter 3 items followed
         by its price and you will calculate total price and show as a report.

                -Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

 */
