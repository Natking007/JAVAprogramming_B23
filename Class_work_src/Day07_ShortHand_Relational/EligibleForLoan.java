package Day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name = "Dave";
        int age = 27,
                workHistory = 4,
                cScore = 740,
                daveIncome = 5000;
        boolean isEligibleFrLoan = daveIncome >= 60000 && workHistory >= 2 &&
                                    cScore >= 700   && age >= 18;
        System.out.println(name + " is eligible for a loan:" + isEligibleFrLoan);

    }
}
