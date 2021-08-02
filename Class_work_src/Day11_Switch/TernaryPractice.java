package Day11_Switch;

public class TernaryPractice {
    public static void main(String[] args) {
        /*
         Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
         */
        double salary = 90_000;
        int creditScore = 720;
        String result = (salary >= 60000 && creditScore >= 650)? "loan Approved" :"Loan Denied";
        System.out.println(result);

        /* Regular way of writing it
        if(salary >= 6000 && creditScore >= 650) {
              result = "loan approved";           // if the person is eligible for a loan
        }else {
             result = "loan denied";               // if the person is not eligible for loan
    }
  */

        System.out.println("---------------------------------------------------------------------------");
        /*
        Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY

         */
        String sport = "Soccer";
        int amount = (sport == "Soccer" || sport == "Tennis")? 100:50 ;
        System.out.println("Price = " + amount);

        System.out.println("----------------------------------------------------------------------");
        /*
        write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with different values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST APPLY TERNARY

         */
        int n1 = 25,
                n2 = 9,
                n3 = 19;
        String biggest = (n1 > n2 && n1 > n3)? "n1 is bigger":(n2 > n1 && n2 > n3)? "n2 is bigger": "n3 is bigger";
        System.out.println("This = " + biggest);

        System.out.println("----------------------------------------------------------------------------");
           String batchType  = "US morning";
           String result2 = "";
          // if(batchType == "US morning" || batchType == "US evening" || batchType =="EU" )
               // a better way to write line 59 would be
               boolean isvalid = batchType == "US morning" || batchType == "US evening" || batchType =="EU";
               if(isvalid) {
                   if (batchType == "US morning") {
                       result2 = "10 am -5pm EST. M,T,TH,F";
                   } else if (batchType == "US evening") {
                       result2 = "7pm - 10pm EST. M,T,W,Th,S,S";
                   } else {
                       result = "10 am - 5pm EST. M,T,W,TH,F.";
                   }
               }else {
                       result2 = "Invalid";
                   }
                   System.out.println(result2);

        /*
         In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is it a US batch or EU batch

            - for US batches:

                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
         */

        System.out.println("--------------------------------------------------------------------------");
        int number = 12;
        String name = "";

                        // This code (82-85) is an example of ternary with a precondition in side it( the first
                       // statement inside the bracket)
            name =(number >= 1 && number <= 12)? (number == 1)?"Jan":(number == 2)?"Feb":(number == 3)?"Mar":(number == 4)?"April":
                    (number == 5)?"May":(number == 6)?"June":(number == 7)?"July":(number == 8)?"August":
                            (number == 9)?"Sep":(number == 10)?"oct":(number == 11)?"Nov":"Dec":"Invalid";
        System.out.println(name);


      /*  if(number >= 1 && number <= 12)  { // 11? and 11: - the number of colons and questions marks has to be the same
            name = (number == 1)?"Jan":(number == 2)?"Feb":(number == 3)?"Mar":(number == 4)?"April":
                    (number == 5)?"May":(number == 6)?"June":(number == 7)?"July":(number == 8)?"August":
                            (number == 9)?"Sep":(number == 10)?"oct":(number == 11)?"Nov":"Dec";
        }else {
            name = "Invalid";

       */

        System.out.println("--------------------------------------------------------");
/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

                  NOTE: MUST APPLY NESTED IF
 */
        int age = 45;
        String ageGroup = "";

        if( age >= 0 && age <= 150){
            if(age < 21){
                ageGroup = "Teenager";
            }else if(age >= 21 && age < 55){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }
        }else{
            ageGroup = "Invalid";
        }

        System.out.println("ageGroup = " + ageGroup);





    }
}