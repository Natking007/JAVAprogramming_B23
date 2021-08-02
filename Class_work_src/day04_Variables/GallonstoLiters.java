package day04_Variables;

/*

    3. create a class called GalonsToLiters, and write a program that can convert the gallons tto
            Ex:
                galon = 10;

           Hint: 1 gallon = 3.78541 liters

 */

public class GallonstoLiters {
    public static void main(String[] args) {

        int gallon = 10;
        double liters = gallon * 3.78541;

        System.out.println("Gallon:" + gallon);
        System.out.println("Liters:" + liters);
}
}