package Day09;

public class PassorFail {
    public static void main(String[] args) {
        int grade = 50;
        // When done with a bunch of if statement
        if(grade >= 60){
            System.out.println("passed");
        }
        if(grade < 60){
            System.out.println("Failed");
        }

        System.out.println("_-------------------------------");
        //When done with if-else statement
        if (grade >= 30) {
            System.out.println("Passed");
        } else { // can not be used by itself with out if statement
                System.out.println("Failed");
            }


    }
}
