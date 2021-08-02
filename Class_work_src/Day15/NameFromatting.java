package Day15;

import java.util.Scanner;

public class NameFromatting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine().trim();//muHtaR
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        // trim(), removes white spaces.
        System.out.println(firstName);

    }
}
