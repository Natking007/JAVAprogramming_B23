package Day10;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int number = 100;
        String result ="";
        int score = 100;
      /*
        if (number > 0) {
         result = "positive";
        }else if (number <0){
            result = "";
        }else{
            result = "zero";
        }
       */
           // With ternary the above code will look like this
        String result2 = (number > 0) ? "Postive" :(number < 0)? "Negative" : "Zero";
        System.out.println(result2);
        System.out.println("------------------------------------------------");

         /*  This code below is in ordinary form
        char grade = ' ';
        if(score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        */

        char grade = (score >= 90) ? 'A' :(score >= 80) ? 'B' :(score >= 70) ? 'C':
                (score >= 60)?  'D':'F';
        System.out.println(grade);
    }
}
