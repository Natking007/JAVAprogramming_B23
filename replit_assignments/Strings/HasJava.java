package Strings;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        boolean hasJava=true ;

//if(word.contains("java")) {

    if (word.charAt(0) == 'j' || word.charAt(1) == 'j') {
        System.out.println("true");

    } else {
        System.out.println("fasle");
    }

}

    }
//}
