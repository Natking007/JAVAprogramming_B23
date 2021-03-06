package Strings;

import java.util.Scanner;

public class Middle_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int middle = word.length()/2;
 if(word.length() % 2 != 0 && word.length() >= 3){

     System.out.println(word.charAt(middle));

   } else if(word.length() == 1){
     System.out.print(word+word+word);

 }

 if(word.length() % 2 == 0 && word.length() >= 4) {
     System.out.print(word.substring(middle-1,middle+1));


 }else if(word.length() == 2){
     System.out.print(word+word);

 }
}
}
/*
Alternate method
public class Middle_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int middle = word.length() / 2;

        if (word.length() % 2 != 0) {

            if (word.length() >= 3) {

                System.out.println(word.charAt(middle));

            } else {
                System.out.print(word + word + word);

            }

        }else {

            if (word.length() % 2 == 0) {

                if (word.length() >= 4) {
                    System.out.print(word.substring(middle - 1, middle + 1));
                } else {
                    System.out.print(word + word);
                }
            }
        }
    }
}
 */
/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      @@ ==>@@@@
      $$ ==>$$$$
      $$ ==>$$$$
      hi ==> hihi
 */