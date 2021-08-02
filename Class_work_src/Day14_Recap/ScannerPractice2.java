package Day14_Recap;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your zipcode: ");
        long zipCode = scan.nextLong();
        System.out.println("how many people do you live with?");
        byte numberOfPeople = scan.nextByte();
        System.out.println("are you married?");
        boolean isMarried = scan.nextBoolean();
        System.out.println("I see you are " + ((isMarried)? "married":"not married")
                + " and live with "+ numberOfPeople+" people in your house which is in the "+ zipCode+"area1");
    }
}
