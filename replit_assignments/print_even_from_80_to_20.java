import java.util.Scanner;

public class print_even_from_80_to_20 {
    public static void main(String[] args) {

        int usernumber = 80;
        int result = 0;

        for (int i = usernumber; i > 20-1 ; i--) {
                 if(i % 2 == 0) {
                     System.out.print(i + " ");
                 }
        }

        }
    }

/*
Write a for loop that prints all even
integers from 80 through and including 20.
Separate each number with a space
 */
