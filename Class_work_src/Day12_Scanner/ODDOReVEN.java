package Day12_Scanner;

import java.util.Scanner;

public class ODDOReVEN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int number = scan.nextInt();
        System.out.println((number % 2 !=0)? "odd":"even");
        System.out.println( (number>0)?"positive" :(number < 0)? "Negative":"zero");
    }
}
