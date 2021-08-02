package Strings;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        char each1 = 0,
                each2 = 0;
        for (int i = 0; i < word1.length(); i++) {
            each1 = word1.charAt(i);// this gets every char from word1
            //  System.out.print(each1);

            for (int j = 0; j < word1.length(); j++) {
                each2 = word2.charAt(i);// this gets every char from word2

                // as you'll notice charAt(i) will do the job
                // but if you put charAt(j) it will only
                // concatenate it with the last index of word2.
                // why?
                //System.out.print(each2);
            }


            if (word1.length() == word2.length()) {

                System.out.print(each1 + "" + each2);
            } else {
                System.out.println("cannot merge");
            }


        }
    }  }


//System.out.println(word1.concat(word2));
/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters,
 print "cannot merge"

Merge their characters one by one and print together like below:

Input:
aok
lol

Output:
alookl

Input:
aok
lol

Output:
alookl

Input:
ear
pie

Output:
epaire

Input:
ear
pie

Output:
epaire

Input:
java
wow

Output:
cannot merge

Input:
java
wow

Output:
cannot merge

hint:

by inserting +""+ (empty string) between chars,
you can concatenate char values.
 */
