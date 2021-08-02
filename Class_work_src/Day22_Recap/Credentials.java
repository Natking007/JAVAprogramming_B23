package Day22_Recap;
import java.util.Scanner;
public class Credentials {
    public static void main(String[] args) {
        String correctUserName = "cybertek";
        String correctPassword = "cybertek12345";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();// u: used to store username entered by user

        System.out.println("Enter your password");
        String p = scan.next();// p: used to store password entered by user

        if (u.equals(correctUserName) && p.equals(correctPassword)) {
            System.out.println("Logged In");
        } else {// if user provides incorrect username and password.
            //the user will have 3 attempts to log in if entered wrong creds.
            // we insert a for loop(since we know how many chances we want to give to user)
         for (int i = 0; i <= 3; i++) {

             System.out.println("Username or password is incorrect, please re-enter");
             System.out.println("Enter your username");
             u = scan.next();

             System.out.println("Enter your password");
             p = scan.next();

             if (u.equals(correctUserName) && p.equals(correctPassword)) {
                 System.out.println("Yout logged in");
                 break;
             }
             if (i == 3) {
                 System.out.println("your account is locked");
                 System.exit(0);
             }
scan.close();
         }
        }
    }

}


/*
 You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                 three attempts to enter correct credentials and if all three attempts are failed,
                 then print "Your account is locked."
*/