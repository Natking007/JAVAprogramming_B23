import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        long factorial = 1;
        //int i =number;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;// factorial is initialized with 1. So you can see this as,
            // 1 * n-1. Since the for condition makes the number = counter (i), when you put in
            //a number as long as its greater than 1 or equal to 1 then proceed to decrease 1 in the
            // next iteration.
            System.out.print((i*1+"*")+"");
        }
        System.out.println();
            System.out.println(factorial);

        }

    }






