package Strings;

import java.util.Scanner;

public class String_no_end {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String newTxt = txt.substring(0,txt.length()-1);
        System.out.println(newTxt);

    }
}
/*
Given a String **txt** print the value without the last letter

Ex:

```
Input:
foo
```
```
Output:
fo
```

```
Input:
run
```
```
Output:
ru
```

Hint: Use substring() and length()
 */