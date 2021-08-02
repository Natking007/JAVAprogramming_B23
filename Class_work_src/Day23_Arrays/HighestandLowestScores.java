package Day23_Arrays;

public class HighestandLowestScores {
    public static void main(String[] args) {
        int[] score = {85, 70, 95, 90, 100,120};
        //             0, 1, 2, 3, 4
        String[] names = {"mike", "Adam", "Tonny", "John", "Amy","Muhtar"};
        int maxScore = score[0];
        String maxName = "";
        int minScore = score[0];
        String minName = "";

        // loop below will get each score and then go through them
        // to find which one is the highest and then it assigns them to the
        // to the name based on the index of the highest score.

        for (int i = 0; i <= names.length - 1; i++) {
            // we used(score.length-1) because both name and score will
            // return (4).
            // System.out.println(names[i]+":"+score[i]);
            String eachName = names[i];// gets each names from the name array
            int eachScore = score[i];// gets each score from the score array

            if (eachScore > maxScore) {// used to compare the scores to assign the max score to
                maxScore = eachScore;// maxScore
                maxName = eachName;
            }
            if (eachScore < minScore) {// used to compare the scores to assign the max score to
                minScore = eachScore;// maxScore
                minName = eachName;
            }
        }
        System.out.println(maxName +" : "+maxScore);
        System.out.println(minName+" : "+minScore);
    }
}
