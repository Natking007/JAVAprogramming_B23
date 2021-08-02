import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Item1 and its Price");

        String Item1 = scan.next();
        scan.nextLine();
        int price1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Item2 and its Price");
        String Item2 = scan.next();
        scan.nextLine();
        int price2 = scan.nextInt();
        System.out.println("Enter the Item3 and its Price");
        String Item3 = scan.next();
        int price3 = scan.nextInt();
        scan.close();
        System.out.println("Item1: "+ Item1+" Price: "+price1+", "+"Item2: "+ Item2+" Price: "+price2+", "+
                "Item3: "+ Item3+" Price: "+price3);
        System.out.println("Total price: "+ price1+price2+price3);


    }
}
/*
Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
 */