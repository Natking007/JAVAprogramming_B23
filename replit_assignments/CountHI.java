import java.util.Scanner;

public class CountHI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        int counter = 0;

        for (int i = 0; i <= userInput.length()-2; i++) {// i: is to count
            // through user input
           String eachword = userInput.substring(i,i+2);
           if(eachword.equals("hi")){
               counter++;

                }

            }
        System.out.println(counter);

        }

    }

/*
Print out the number of times that
the string "hi" appears anywhere in the given string.
 Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
copied!
input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1
 */
