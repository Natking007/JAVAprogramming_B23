package Day13;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter building number");
        int buildNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("please enter street address");
        String address = scan.nextLine();

        System.out.println("please enter city name");
        String city = scan.nextLine();
        System.out.println("please enter state");
        String state = scan.next();
        System.out.println("please enter ZipCode");
        String zip = scan.next();
        scan.nextLine();
        System.out.println("please enter full name");
        String name = scan.nextLine();
        System.out.println("Shipping info - " + "\n" +name +"\n"+"building number- "+
                buildNumber+"\n"+address+" "+city+ "\n"+state + " " + zip );

    }
}
