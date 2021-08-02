package Day09;

public class GradeReport {
    public static void main(String[] args) {
        int grade = 120;
        if(grade >= 90 && grade <= 100 ){
            System.out.println("You got an A");
        }else if (grade >= 80){
            System.out.println("you got a B");
        }else if(grade >= 70){
            System.out.println("you got a C");
        }else if (grade >= 60) {
            System.out.println("Your grade is a D");
        }else {
            System.out.println("You need to take it again");
    }
    }

}
