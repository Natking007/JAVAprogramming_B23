package day04_Variables;

public class TaxCalculation {
    public static void main(String[] args) {
        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary -totalFederalTax -totalStateTax;
        System.out.println("Your salary is $"+salary);

        // you need to pay totalStateTax to state tax
        System.out.println("You need to pay $" + totalStateTax + " of state tax");

        // you nned to pay totalFederalTax of federal tax
        System.out.println("You need to pay $" + totalFederalTax + " of federal tax");

        // your take home salary is salaryAfterTax is
        System.out.println("You need to pay $" + salaryAfterTax);
    }
}
