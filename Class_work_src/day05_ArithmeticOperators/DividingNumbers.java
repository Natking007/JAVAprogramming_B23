package day05_ArithmeticOperators;

public class DividingNumbers {
    public static void main(String[] args) {

        int num1 = 10;
               double num2 = 3.0;
        double result = num1/num2;
        double remainder = num1%num2;

        System.out.println("Result = "+ result + "\n"+"Remainder = "+ remainder);

        System.out.println((int)(10.0/3));

long a = 3_000L;
double b=(float)a;
int c = (short)b;
        System.out.println(c%1000);

    }
}
