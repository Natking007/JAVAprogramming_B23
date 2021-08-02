package Strings;

import java.util.Scanner;

public class WithoutXx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String newWord="";

        if (word.contains("x")){

            newWord=word.replaceAll("x"," ");

        }else if(word.contains("X")){

            newWord=word.replaceAll("X"," ");

        }else{

            System.out.println(word);
        }
        System.out.println(newWord);
    }

}

/*
Given a string word,
if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.


Example:

```
input: xHiX

output: Hi
```

```
input: apple

output: apple
```

```
input: xUxL

output: UxL
```

 */