package Day10;

public class TernaryPractice {
    public static void main(String[] args) {
        int age = 23;
        String result ="";
        String resultt = (age >= 21) ? "eligible": "not eligible";
        System.out.println(result);
        /* This is the ordinary or non ternary way.
         if(age >= 21){
            result = "eligible";
        }else {
            result = "not eligible";
        }

        */

        int score = 80;
        System.out.println( (score>60) ? "Passed":"Failed" );



    }
}
