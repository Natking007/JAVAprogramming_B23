package Day22_Recap;

import java.util.Scanner;

public class YEsorNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("no"))){
            // to make sure user enters either yes or no.
            System.out.println("Invalid entry, please re-enter");
            answer = scan.next();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else if (answer.equalsIgnoreCase("no")){
            System.out.println("RIP");
        }
        scan.close();
    }
}
