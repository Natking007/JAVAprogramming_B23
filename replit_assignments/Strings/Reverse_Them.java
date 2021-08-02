package Strings;

import java.util.Scanner;

public class Reverse_Them {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
         String reversedString = "";

         if(word.length() < 5){
            System.out.println("Too short");
        }else if(word.length() > 5) {
            System.out.println("Too long");
        }else{
             reversedString += word.charAt(4);
             reversedString += word.charAt(3);
             reversedString += word.charAt(2);
             reversedString += word.charAt(1);
             reversedString += word.charAt(0);
         }

        System.out.println(reversedString);
    }
}
/*
Write a program that will reverse a string.
Your program should reverse a string _only 5 characters long_.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.

Example:

```
input: cat

output: Too short!
```

```
input: singularity

output: Too long!
```
```
input: apple

output: elppa
```

 */