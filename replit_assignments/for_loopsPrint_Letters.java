import java.util.Scanner;
import java.util.Arrays;
public class for_loopsPrint_Letters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char userLetter = scan.next().charAt(0);

        char userLetter2 = scan.next().charAt(0);

        for (char i = userLetter; i <= userLetter2 ; i++) {
            System.out.println(i);
        }
        }

        }



