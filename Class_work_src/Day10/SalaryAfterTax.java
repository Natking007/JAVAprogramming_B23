package Day10;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 100_000;
        double taxRate = 0;
        if (salary >= 13000){
            taxRate = 0.35;
        }else if(salary >= 1000000){
            taxRate = 0.30;
        }else if(salary >= 80000){
            taxRate = 0.25;
        }else {
            taxRate = 0.20;
        }
           boolean isMarried = true;
        if (isMarried){
            taxRate = 0.05;
        }
        double salaryAftertax = salary - (salary*taxRate);
        System.out.println("Salary after tax = "+ salaryAftertax);

    }
}
/*

2. Write a program that can calculate the salary after tax based on the following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax, otherwise pays 5% extra tax
 */
