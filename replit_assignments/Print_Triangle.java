import java.util.Scanner;

public class Print_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();
        //char symbols = '*';
        for (int i = 0; i <= userNum ; i++) {// outer loop for rows

            for (int j = 0; j <= i ; j++) {// inner loop for columns
                // in this for loop the condition states that you
                // as long as j is less than or equal to i, i being the counter for the outer loop
                // during the first iteration one "*" is printed,
                // at second iteration "* *" will be printed right after the previous one thus adding to the
                // column. And so on.
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
/*
Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****
input: 5

output:
*
**
***
****
*****
Example:

input: 3

output:
*
**
***

 */