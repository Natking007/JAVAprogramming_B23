package Day23_Arrays;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
                     //   0,       1,         2,
        String[] days = {"monday","tuesday","Wednesday"
         // 3,      4,        5,         6
        ,"thursday","Friday","saturday","sunday"};// size- is 7

        System.out.println("Enter number");
        Scanner scan= new Scanner(System.in);
        int n = new Scanner(System.in).nextInt();
        System.out.println(days[n-1]);
    }
}
