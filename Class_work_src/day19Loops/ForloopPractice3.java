package day19Loops;

public class ForloopPractice3 {
/*
 print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {//i:0,1,2,3,4,5,6,7,8
            System.out.println("\t* * * * * * ");
        }
        System.out.println("------------------");

        /*
  print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

 */
        System.out.println("**********");
        for (int i = 0; i < 8 ; i++) {
            System.out.println("*         *");

        }
        System.out.println("************");
        System.out.println("-----------------------------------");
//write a program that can
// calculate the sum of all numbers between 1 to 100
        for (int i = 0; i <100 ; i++) {


        }
    }
}

