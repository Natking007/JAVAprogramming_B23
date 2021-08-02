package Day13;

import java.util.Scanner;

public class FreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();
        System.out.println("Are you a prime member? please enter 'Y' or 'N' ");
      //  boolean isPrime = scan.nextBoolean(); // Change this to something other than boolean, to
                                              // char so that user can hit y or n
        String isPrime = scan.next();
        double totalCost = (isPrime == "Y")? price :( isPrime == "N" && price >= 15)? price + 3.99:
                price;
        System.out.println("total Cost = $"+ totalCost);
    }
}
