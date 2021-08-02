package day19Loops;

public class ForloopPractice {
    public static void main(String[] args) {
        for(int i = 0; i <= 100;i++){//i:1,2,3,4,5......100
            System.out.println(i +"");
        }
        System.out.println();
        System.out.println("-----------------");
        for (int i = 1; i <= 100; i++) {// and make sure the curly braces are covering that for statement
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }
            System.out.println();
            System.out.println("----------------");
            for (int i =1; i<=100;i+=2){
        }
    }
}
