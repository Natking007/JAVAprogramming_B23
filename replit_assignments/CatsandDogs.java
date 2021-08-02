import java.util.Scanner;
public class CatsandDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int countOfCats =0 ;
        int countofDogs= 0;
        String word = scan.next();

        while (word.contains("cat")&& word.contains("dog")) {
            countOfCats++;
              countofDogs++;
              if (countOfCats == countofDogs) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
              break;
        }
        System.out.println(countOfCats);
        System.out.println(countofDogs);
    }
}












/*boolean isCorrect = word.equalsIgnoreCase("CatDog");
if(isCorrect){
    System.out.println(isCorrect);
}else if(word.equalsIgnoreCase("dogogcat")){
    System.out.println("true");
}else{
    System.out.println("false");
}
    }
}
/*
Print true if the string _"cat"_ and _"dog"_ appear
the same number of times in
the given string _word_.


Example:

```
input: catdog
output: true
```

Example:

```
input: catcat
output: false
```

Example:

```
input: cat-cheetah-dog-cat
output: false
```
 */