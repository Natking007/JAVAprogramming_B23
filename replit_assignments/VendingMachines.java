import java.util.Scanner;
public class VendingMachines {
    public static void main(String[] args) {
        int quarter, dimes,nickels,pennies;
        System.out.println("Enter cents:");
        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();
        if(cents > 0 && cents <= 100 ){
            quarter = cents/25;
            dimes = cents%25/10;
            nickels = cents%25%10/5;
            pennies = cents%25%10%5;
            System.out.println("Your change is "+quarter+" quarter, "+dimes+" dimes, "+nickels+" nickels "+pennies+
                    " pennies");

        }else{
            System.out.println("Invalid cents amount");
        }
    }

}
/*
Write a program that will determine the change given from the vending machine.
The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

1. The given cents value should be more than 0 and less than 100.
If the given cents is not in the range print "Invalid cents amount" and
there should be no other output after

In valid cases print the change in this format:
Your change is x quarters, x dimes, x nickels, and x pennies

```
Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies

```

 */
