package Day07_ShortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Aaron King";

        int age = 34;

        String citizen = "UK";

        int creditScore = 630;

        boolean eligibleToVote = age >= 18 && citizen == "USA" && creditScore >= 700;
        //                         34>= 18 && "UK" == "USA"
        //                          true   && false
        // in order for the result to be come true during an "AND" logic, both conditions
        // have to be met.

        System.out.println(name + " is eligible to vote for biden: " + eligibleToVote);
    }
}
