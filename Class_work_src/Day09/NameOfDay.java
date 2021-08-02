package Day09;
//Write a program that can print out the name of the day based on the number 1-7
public class NameOfDay {
    public static void main(String[] args) {
        int day = 1;
// this code below is a sort of redundant,it is right but not efficient,
// which is not good for performance since the compiler
// will still go through all the rest of the conditions.
        if (day == 1) {
            System.out.println("Monday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day == 3) {
            System.out.println("Wednesday");
        }
        if (day == 4) {
            System.out.println("Thursday");
        }
        if (day == 5) {
            System.out.println("Friday");
        }
        if (day == 6) {
            System.out.println("Saturday");
        }
        if (day == 7) {
            System.out.println("Sun");
        }
    }
    }
// When you need to create three or more conditions then multi-branch if-else statements are suitable
/*
This is the syntax of a multi-branch
if(condition){
     statement1;
     } else if (conditions2){
     statements2;
     } else if (condition3){
     statement3;
     }else{
     statement4;
     }
 */