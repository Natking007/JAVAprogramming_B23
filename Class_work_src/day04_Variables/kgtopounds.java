package day04_Variables;

/*create a class called KgToPounds, and write a program that can convert the given Kg to pound and print the result
        Ex:
        if kg = 10;

        output:
        22.0462

        Hint: 1 kg = 2.2 pounds

 */

public class kgtopounds {
    public static void main(String[] args) {
         int Kg = 1000;
         double pounds = Kg * 2.2;

        System.out.println("KG :" + Kg);
        System.out.println("Pound :" + pounds);
    }
}
