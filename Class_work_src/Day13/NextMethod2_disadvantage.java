package Day13;

import java.util.Scanner;

public class NextMethod2_disadvantage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();
        scan.nextLine(); // Enter, allows us to use the scanner for another
                         // entry from the user. in this case the age and the
                         // job title
        System.out.println("enter your job title");
        String jobTitle = scan.nextLine();
        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);

    }
}
