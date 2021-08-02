package Day07_ShortHand_Relational;

public class ShortHand {
    public static void main(String[] args) {
        String name1 = "Muhtar";
        String name2 = "Mehmet";
                String name3 = name2;

               // swiping variable/ reassignment
        name2 = name1;// after this step name2 value is saved in name 1
        name1 = name2; // in this process we have lost the data of name2

        name1 = name3; // By creating a third variable we have saved "Mehemt"
                       // by reassigning it to name 1.

        System.out.println("name1= " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("------------------------");
        int a = 200;
        System.out.println("a = " + a);// this will only print 200, since
        a = 100 + 300;//<== this equation or addition came after the print line
                      // Note!! JAVA is a top down language

        System.out.println("a = " + a);// 400

        System.out.println("--------------------------");
         int balance = 300;
         // balance = balance + 200 <== this can be written as below
        balance += 200;// addition assignment
        System.out.println("balance = " + balance);//500

        balance += 1000;
        System.out.println("balance = " + balance);//1500 since the value of balance has now
                                                   //become 500 after line 31.

        balance -= 300; // subtraction assignment
        System.out.println("balance = " + balance);// 1200

        System.out.println("-------------------------------------");


        String school = "Cybertek";
        school += "School"; // you can use the + operator on strings as wel
                            // but only this operator(the rest are for numbers)
                           // this method is known as Concatenation???
        System.out.println("school = " + school);

        System.out.println("-----------------------------");

        String name = "John";
        String lastName = "Daniel";
        name += " "; // Your adding the value here
        name += lastName;

        System.out.println("name = " + name);

        System.out.println("=------------------------------");
        // division  assignment



    }
}
