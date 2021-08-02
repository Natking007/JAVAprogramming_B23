package day04_Variables;

// always declare before print statement!!!
public class VariablePractice {
    public static void main(String[] args) {
       // int num1 = 100,num2 = 1000, num6 = 85000;
         // the above decleration is the same as the one below(choose which ever)
         int num1 = 100;
         int num2 = 10000;
         int num6 = 850000;

         // double is always prefered for the decimals, compiler always takes it as double anyways
        // so sometimes you have to force floats to be compiled as double

        float num7 = 5.5f; // in this variable since a larger premitive cannot be assigned to smaller primitives directly
                           // thus I have to add an "f" or "F"
         double num3 = 3.5;
         double num4 =2.5f;
         // the below number is a long number that has been forced to be compiled
        // the "L" or "l" at the end is because JAVA takes the number below as Integer by default(a large one in this instance)
         long num5 = 999999999L;

        System.out.println("num1 ="+ num1);
        System.out.println("num2 ="+ num2);
        System.out.println("num3 ="+ num3);
        System.out.println("num4 ="+ num4);
        System.out.println("num5 ="+ num5);
        System.out.println("num6 ="+ num6);




    }
}
