package Day12_Scanner;

import java.util.Scanner;

public class DaysInweek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number from one to seven");
int num = scan.nextInt();
        System.out.println((num == 1)? "Monday":(num == 2)? "Tuesday"
                :(num == 2)? "WED":(num == 2)? "THU":(num == 2)? "FRI"
                :(num == 2)? "SAT":(num == 2)? "SUN":"don't know buddy");

    }
}
