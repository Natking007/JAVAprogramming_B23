package Day14_Recap;

import java.util.Scanner;

public class TernarySwitchPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~7:");
        int n = scan.nextInt();

        String name = (n >= 1 && n <= 7)?
                ( n ==1)? "Monday":(n == 2)? "Tuesday":(n ==3)? "wedneday"
                        :(n == 4)? "Thursday" :(n == 5)? "Friday" :(n == 6)? "saturday":"sunday":
                "no such day";


        System.out.println("--------------------------------------");
        String name2 = "";

        if (n >= 1 && n <= 7) {

            switch (n) {
                case 1:
                    name2 = "Monday";
                    break;
                case 2:
                    name2 = "Tuesday";
                    break;
                case 3:
                    name2 = "Wednesday";
                    break;
                case 4:
                    name2 = "Thursday";
                    break;
                case 5:
                    name2 = "Friday";
                    break;
                case 6:
                    name2 = "Saturday";
                    break;
                default:
                    name2 = "Sunday";
            }

        } else {
            name2 = "No Such A Day";
        }

        System.out.println("name2 = " + name2);

    }
}
