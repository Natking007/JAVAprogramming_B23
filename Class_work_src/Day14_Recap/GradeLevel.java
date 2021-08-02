package Day14_Recap;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Enter your grade number");
        byte number = scan.nextByte();
        if(number >= 1 && number <= 18){

            result = (number<= 5)?"Elementary school":(number<= 8)?"Middle school":
            (number<=12)? "High School":(number<=16)?"college":"Grade school";

        }else{
            result = "Invalid";
        }

    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    Other: Invalid grade level given

 */