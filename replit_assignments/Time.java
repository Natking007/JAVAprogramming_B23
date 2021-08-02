import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        int hour,
                minute,
                second;
        String amOrPm = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the hour,min and sec and AM/PM");
        hour = sc.nextInt();
        sc.nextLine();
        minute = sc.nextInt();
        sc.nextLine();
        second = sc.nextInt();
        sc.nextLine();
        amOrPm = sc.next();
        sc.close();
        System.out.println("The time is:"+ hour+":"+minute+":"+second+" "+amOrPm);




    }
}
/*
In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.

Declare amOrPm variable that can hold a String ("AM" or "PM")

Instructor will set different values to your variables

Using the variables and concatenation, print values in the format mentioned above.
 */
