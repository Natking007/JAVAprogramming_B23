package day03_Variables;

public class Currencies {
    public static void main(String[] args) {

        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar * 0.81;
        double ruble = dollar * 73.60;

        System.out.print("Lira:");
        System.out.println(lira);

        System.out.println("dollar =" + dollar );

        System.out.print("Euro:");
        System.out.println(euro);

        System.out.print("Ruble:");
        System.out.println(ruble);

    }
}
