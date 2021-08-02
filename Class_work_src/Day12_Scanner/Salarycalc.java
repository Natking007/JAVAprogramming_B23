package Day12_Scanner;
import java.util.Scanner;
public class Salarycalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your hourly rate?");
        double hourlyRate = scan.nextDouble();
        System.out.println("How many hours do you work in a year");
        int weeklyhour = scan.nextInt();
        System.out.println("How many weeks do you work in a year");
        int weeks = scan.nextInt();
        double salary = hourlyRate * weeklyhour * weeks;


    }
}
