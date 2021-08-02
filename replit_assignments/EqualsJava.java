import java.util.Scanner;

public class EqualsJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wordCounter1 = 0;
        int wordCounter2 = 0;

        String userInput = scan.nextLine();
        for (int i = 0,j = 0; i <= userInput.length()-4 && j<=userInput.length()-6; j++, i++) {
            String javaFinder  = userInput.substring(i,i+4);
            String pythonFinder = userInput.substring(j,j+6);
            if(javaFinder.equals("java")){
                wordCounter1 = wordCounter1+1;
            }else if (pythonFinder.equals("python")){
                wordCounter2 = wordCounter2+1;

            //for (int j = 0; j <= userInput.length()-6; j++) {
             //   String pythonFinder = userInput.substring(j,j+6);
               // if (pythonFinder.equals("python")){
                 //   wordCounter2 = wordCounter2+1;
                }

            }
        System.out.println("Count of java: "+wordCounter1);
        System.out.println("Count of python: "+wordCounter2);
        boolean isEqual = wordCounter1==wordCounter2;
        System.out.println(isEqual);

        }


    }

/*
Given a string, print out true if the number of appearances of "java"
anywhere in the string is equal to the number of appearances of "python"
anywhere in the string (case sensitive).

Example:

input: We study java not python

output: true
input: We study java not python

output: true
Example:

input: What's the difference between java, javascript and python?

output: false
 */