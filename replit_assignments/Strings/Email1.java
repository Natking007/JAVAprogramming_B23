package Strings;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName;

                String lastName;

               String reversedname ="";

               int endOffirstName = 0;

               int endOflastName = 0;

        if (email.contains("_")){

            endOffirstName = email.indexOf("_");//stores the index of the underscore

            endOflastName = email.indexOf("@");// stores the index of the @

            // the above variables give us indexes that can help in
            // specifying the range in the substring method

            firstName = email.substring(0,endOffirstName);
           System.out.println(firstName);
            lastName = email.substring(endOffirstName+1,endOflastName);
            System.out.println(lastName);

            reversedname = lastName+"_"+firstName;

            System.out.println(reversedname+"@gmail.com");




        }else{
            System.out.println(email);
        }
    }
}
/*
Swap first name with last name in the email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input email.

Examples:


```
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
```

```
input: barakobama@gmail.com

output: barakobama@gmail.com
```


 */
