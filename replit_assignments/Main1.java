import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE
        String result = (num1 == num2)? num1 + "and" + num2 + "are equal": "Put valid num";
        System.out.println(result);

    }

}
