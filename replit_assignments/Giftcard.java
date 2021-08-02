import java.util.Scanner;
public class Giftcard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gCard = 100;
        int cBalance = 0;

        System.out.println("Enter item");
        String item = scan.next();

        if (item.equalsIgnoreCase("Hat") && gCard > 0) {
            cBalance = (gCard - 25);
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (cBalance) + "$");
        } else if (item.equalsIgnoreCase("HeadPhones") && gCard > 0) {
            cBalance = (gCard - 30);
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (cBalance));
            scan.next();
        } else if (item.equalsIgnoreCase("Laptop") && gCard > 0) {
            cBalance = (gCard - 200);
            System.out.println("Thank you for your purchase!");
            System.out.println("Sorry, not enough funds on your gift card!");
            scan.nextLine();
        } else if (item.equalsIgnoreCase("Pillow") && gCard > 0) {
            cBalance = (gCard - 40);
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (cBalance));
            scan.nextLine();
        } else if (item.equalsIgnoreCase("Socks") && gCard > 0) {
            cBalance = (gCard - 5);
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (cBalance));
        } else if (item.equalsIgnoreCase("USBcable") && gCard > 0) {
            cBalance = (gCard - 10);
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + ((cBalance)));
        } else if (item.equalsIgnoreCase("Pants") && gCard > 0) {
            cBalance = (gCard - 50);
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (cBalance));
        } else if (item.equalsIgnoreCase("Smartphone") && gCard > 0) {
            cBalance = (gCard - 1000);
            System.out.println("Thank you for your purchase!");
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("Blanket")&& gCard>0) {
                cBalance = (gCard - 60);
            System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (cBalance));
            } else if (item.equalsIgnoreCase("Charger")&& gCard>0) {
                cBalance = (gCard - 15);
            System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + (cBalance));
            }else {
            System.out.println("Invalid Item!");}


            }
        }




/* // System.out.println("Enter item");
        //String item = scan.next();
    }
Let's say I've got a 100$ gift card and you want to buy
something in your online store . Write a program that will help me to buy
 something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 15$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants
- 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
copied!
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Laptop
Output:
Sorry, not enough funds on your gift card!
input: Cupcake
output: Invalid item!
 */
