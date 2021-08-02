package Strings;

import java.util.Scanner;

public class GetSandWich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String inBetween="";


        if (str.contains("bread")) {
            //make sure the sandwich has bread to begin with

          // and then identify the position of the bread
            int bread1 = str.indexOf("bread");
            int bread2 = str.lastIndexOf("bread");// returns the position
            // of the last occurrence of specified characters in a string,
            // thus giving me the position of the second bread in the sandwich

            if(bread1 == bread2){
                System.out.println("nothing");
                // if the position of the first bread equals the last position of the
                // of the bread then there is nothing in between.
            }else {
                inBetween = str.substring(bread1+5, bread2);
                // since the bread1 returns the whole 'bread' we have 5 to
                // it so that it can skip the 5 characters

            }
        } else {
            System.out.println("nothing");
        }
        System.out.println(inBetween);

    }

}
