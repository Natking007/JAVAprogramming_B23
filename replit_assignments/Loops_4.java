import java.util.Scanner;

public class Loops_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        for (int i = 0; i < userNumber ; i++) {
            System.out.println("*");

        }

    }
}
/*
4-Loops

Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1

output: *

input: 1

output: *

Example:

input: 3

output: ***

 */