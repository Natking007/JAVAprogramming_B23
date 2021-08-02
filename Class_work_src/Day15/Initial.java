package Day15;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        firstName. charAt(0);
        char f = firstName.charAt(0); // This charAt method is 6
        char l = lastName.charAt(0);
        String initial = f +" . " + l;
        System.out.println(initial);

    }
}
