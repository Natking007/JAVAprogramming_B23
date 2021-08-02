package Day13;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary = scan.nextInt();

        System.out.println("please enter your gender");
        String gen = scan. next();
        scan.nextLine();// this is necessary because the nextLine method in line 15  will
                        // take every entry the user will put, which will not allow us to put
                      // a full name.
                        // This cleaner(scan.nextLine()) is mandatory in this situation, where
                        // you are using nextLine method.
        System.out.println("please enter your full name");
        String name = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gen);
        System.out.println("Full name = " + name);

    }
}
