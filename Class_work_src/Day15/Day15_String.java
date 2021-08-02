package Day15;

//import java.util.Scanner;

public class Day15_String {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        String str1 = "Cybtertek";
        String str2 = new String( "Cybertek");

        System.out.println("_--------------------------------------");

        String s1 = "Cat";
        String s2 = "CAt";
        String s3 = "Cat";
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true

        System.out.println("--------------------------");

        String s4 = new String("Dog"); // if you are using the "new String" key word
        String s5 = new String("Dog");  // then you are creating two new objects
       String s6 = new String("Dog");   // that are stores in  two different places
        String s7 = s4;                                        // in memory.
        System.out.println( s4 == s5);// will always be false
        System.out.println(s5 == s5);// will always be false
        System.out.println(s7 == s7); // will be true


    }
}
