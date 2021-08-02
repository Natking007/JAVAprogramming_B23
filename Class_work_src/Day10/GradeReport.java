package Day10;

public class GradeReport {
    public static void main(String[] args) {
        int score = 101; // 0-100
        String grade = "";// A,B,C,D (takes in all these values)
        // This is an example of nested if statements
        if (score >= 0 && score <= 100) { // This is the pre-condition of multibranch if statement
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        } else {
                grade = "INVALID";
        }
        System.out.println("Your grade is "+ grade);
    }
}
