package day06;

import java.text.DecimalFormat;

/*
Primitive casting: converting one primitive type to another.
double > float > long > int > short > byte

2 types of casting
implicit casting: casting smaller type to larger. automatically done
 double a = 3
       a ==> 3.0
explicit casting: casting the smaller type to a bigger type


 */
public class PrimtiveCasting {
    public static void main(String[] args) {
        byte a = 10;
        long b = a; // this is an example of implicit casting. The compiler does it self(auto).

double d = 10.0;
int f = (int)(long)d ; //explicit casting
        System.out.println("-----------------");
        long n = 100;
        short m =(short)n;

        float q = 2.5f;
        int u = (int)q;// explicit casting

        System.out.println("--------------------");
        int w =129;
        byte z = (byte) w;
        System.out.println("z = " + z);

        int e = 7000;
        short g = (short) e;
        System.out.println("g = "+ g);
        System.out.println("-----------------------");

        double num1 = 1000.0 ;
        int num2 = (int) num1;
        System.out.println("num2 = " + num2);//1000
        System.out.println("num1 = " + num1);//1000.0

            // This is also a way to convert/cast smaller type to larger ones.
            System.out.println((int)100.23456);

           // DecimalFormat df = new DecimalFormat(pattern:"0.00");
           // System.out.println(df.format(1.567891234));
    }
}
