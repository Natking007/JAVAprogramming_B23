package Day07_ShortHand_Relational;

public class MarketGroup {
    public static void main(String[] args) {
        int score = 42;
        boolean earlyBird = score >= 50 && score <=60;
        boolean group1 = score >= 40 && score <= 49;
        boolean group2 = score >= 30 && score <= 39;
        boolean angryBird = score < 30;

        System.out.println("ealryBird = " + earlyBird);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
        System.out.println("angryBirds = " + angryBird);


    }
}
