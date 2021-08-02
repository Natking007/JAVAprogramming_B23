package Strings;

import java.util.Locale;
import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName,
                lastName,
                domain,
                ofFirstName,
                ofLastName;

        int fnIndex,
                lsIndex;

        fnIndex= email.indexOf("_");// to store or identify where first name stops

        lsIndex = email.indexOf("@");// to identify where the last name ends

        firstName = email.substring(0,fnIndex);

        lastName = email.substring(fnIndex+1,lsIndex);

        domain = email.substring(lsIndex+1,email.length()-4);

        String FirstName = firstName.substring(0,1).toUpperCase();

        System.out.println("First Name: "+FirstName+firstName.substring(1,fnIndex));

        String LastName = lastName.substring(0,1).toUpperCase();

        System.out.println("Last Name: "+ LastName+lastName.substring(1,lastName.length()-1));

        System.out.println("Domain: "+ domain);











        //String LastName = lastName.substring().toUpperCase();

       // System.out.println(LastName);

       // System.out.println(LastName + );

        //System.out.println(domain);


    }
}
/*
Write a program that will print out information
about user based on email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.

Example:

```
Input: craig_federighi@apple.com

```
```
Output:
First name: Craig
Last name: Federighi
Domain: apple
```
 */
