package Day08;

public class PosNegZero {
    public static void main(String[] args) {
        int number = -100;

        boolean postive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        if (postive){ // if number is positive
            System.out.println(number+" is positive");
        }
        if (negative){ // if number is negative
            System.out.println(number+" is negative");
        }

        if(zero){// if number is zero
            System.out.println(number+" is zero");
        }
    }
}
