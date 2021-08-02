package Day08;

public class gradeReport2 {
    public static void main(String[] args) {

        int score = 95;

        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80;// did not make A score and is greater than or equal to 80.
        boolean madeC = !madeA && !madeB && score >= 70; //did not make A score and B score and score is greater than 70.
        boolean madeD = !madeA && !madeB && !madeC && score >= 60;// did not make A,B,C and score is greater than 60
        boolean madeF = !madeA && !madeB && !madeC && !madeD;

    }
}
