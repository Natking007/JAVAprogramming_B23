package Day12_Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
       /* char name = 'A';
        switch (name) {
            case 'A':
                System.out.println("You got an A");
                break;
            case 'B':
                System.out.println("You got an B");
                break;
            case 'C':
                System.out.println("You got an C");
                break;
            case 'D':
                System.out.println("You got an D");
                break;
            case 'F':
                System.out.println("You got an F");
                break;
            default:
                System.out.println("Invalid");

        */
                // The code above can be written like this as well
                System.out.println("---------------------------------------------------");
                char name2 = 'A';
                String result = " ";
                switch (name2) {
                    case 'A':
                        result = "Excellent";
                        break;
                    case 'B':
                        result = "Good Job";
                        break;
                    case 'C':
                        result = "Good";
                        break;
                    case 'D':
                        result = "Passes";
                        break;
                    case 'F':
                        result = "Failed";
                        break;
                    default:
                        result = "Invalid";
                }
                System.out.println(result);
        System.out.println("------------------------------------------------------------");
        /*
        write a program that can print any number between 1 ~ 10,
        but for number which is a multiple of 3 print "Fizz" instead of the number and
        for number which is a multiple of 5, print "Buzz" instead of the number,
         and for number which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.
         */
        int number = 1;
        String result3 = " ";
        switch(number){
            case 3:
            case 6:
            case 9:
                result3 = "Fizz";
                break;
            case 5:
            case 10:
                result3 ="Buzz";
                break;
            case 1:
                result3 = "one";
                break;
            case 2:
                result3 = "two";
                break;
                case 4:
            result =  "Four";
            break;
            case 7:
                result = "five";
                break;
            case 8:
                result = "eight";
                break;
                default:
            result = "INVALID";
        }
        System.out.println(result);

















        }
    }

/*
 a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid

 */

