package day06;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
                boolean calculateLeap = year%4 == 0;
        System.out.println("2020 is leap year: " + calculateLeap);


    }
}
/*
create a class named LeapYear, and write a program that can identify if the given is Leap Year,
print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
 */
