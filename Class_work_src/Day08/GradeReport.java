package Day08;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90 && score <= 100) {
            System.out.println("You have an A");
        }
        if (score >= 80 && score <= 89) {
            System.out.println("You have a B");
        }
        if (score >= 70 && score <= 79) {
            System.out.println("You have a C");
        }
        if (score >= 60 && score <= 69) {
            System.out.println("You have a D");
        }

            if (score < 60) {
                System.out.println("You have an F");
            }


    }
}

/*
score report
grade:
    A: 90 <= score <= 100
    B: 80 <= score <= 89
    C: 70 <= score <= 79
    D: 60 <= score <= 69
    F: score < 60
 */
