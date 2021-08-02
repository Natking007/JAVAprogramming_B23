package Day24;
import java.util.Arrays;
public class Grade {
    public static void main(String[] args) {
        String [] names ={"Anna","Nancy","Sarah","Abbos","Yuliang","Raphel","Tamerlan",
        "Muhtar","Jack"};
                int [] score = {90,75,80,85,91,92,93,45,65};
            char [] grade = new char[names.length];
            //lets find out how many people scored A,B,C
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int i = 0; i <= score.length ; i++) {
            if (score[i] >= 90) {
                grade[i] = 'A';
                countA++; // this will add to the countA variable everyone someone score an A
            } else if (score[i] >= 80) {
                grade[i] = 'B';
                countB++;
            } else if (score[i] >= 70) {
                grade[i] = 'C';
                countC++;
            } else if (score[i] >= 60) {
                grade[i] = 'D';
                countD++;
            } else {
                grade[i] = 'F';
                countF++;
            }
            System.out.println(names[i] + "' score is " + score[i] + ", made " + grade[i]);

        }
        System.out.println("Count A-"+countA);
        System.out.println("Count B-"+countB);
        System.out.println("Count C-"+countC);
        System.out.println("Count D-"+countD);
        System.out.println("Count F-"+countF);
    }
}
