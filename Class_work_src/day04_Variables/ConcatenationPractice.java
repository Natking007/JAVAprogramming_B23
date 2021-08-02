package day04_Variables;

public class ConcatenationPractice {
    public static void main(String[] args) {
        /*
        +;
           addition when we have two numbes
             10 + 10 = 20
            concatenation: when there is at leat one string
             "10" + "10" = "1010"
             1 + "10" = "110"
             "2" + 3 = 23
         */

        String word = "Java";
        System.out.println("My favorite language is " + word + " programming language");
        System.out.println("-------------------------------------------------");
        int dollar = 10000;
        double lira = dollar * 8.41;
        double euro = dollar * 0.9;

        System.out.println(dollar + " US dollars equal to " + lira +" turkish liras");

        int a = 10;
        int b = 20;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;

        System.out.println(a + "+" + b + "="+ addition);
        System.out.println(a + "-" + b + "="+ subtraction);
        System.out.println(a + "*" + b + "="+ multiplication);

        System.out.println("----------------------------------");
        String name ="Bill";
        String favMusic = "Love Yours";
        String favBook = "Inferno";
        String favSeries = "Peaky Blinders";

        System.out.println("Hello my name is \""+ name +"\" ,my favorite song is \"" + favMusic +
                "\"\n my favorite book is \"" + favBook
                +"\"\n and my favorite series is \"" + favSeries + "\"");


    }
}
