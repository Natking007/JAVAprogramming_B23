package day03_Variables;

public class Circle {
    public static void main(String[] args) {

        int r = 5;
        double pi = 3.14;

        double area= r * r *pi;
        double perimeter = 2 * r *pi;

        System.out.print("Area:");    // does not append new line after printing
        System.out.println(area);     //append new line after printing.

        System.out.print("Perimeter:");
        System.out.println(perimeter);
    }
}
