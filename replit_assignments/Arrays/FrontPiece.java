package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[] num = new int[size];

        for(int i =0; i < size; i++) {

            num[i] = scan.nextInt();
            // elements which user will enter
        }
        //WRITE YOUR CODE HERE

        int [] newNums = new int[2];
        int [] newNum2 = new int[1];
    if (num.length >= 2)
        {
            for (int i = 0; i < 2; i++) {
                newNums[i] = num[i];
            }
        }else if(num.length <= 1){
            for (int i = 0; i < 1 ; i++) {
                newNum2[i] = num[i];
                System.out.println(Arrays.toString(newNum2));

            }
        }
        System.out.println(Arrays.toString(newNums));

}





    }


/*
Given an int array **num** of any length, print a new array of its first 2 elements.
 If the array is smaller than length 2, use whatever elements are present.


Examples:

```
input: 1, 2, 3

output: [1, 2]
```


```
input: 1

output: [1]
```

```
input: 4, 5, 4, 3, 8

output: [4, 5]
```
 */
