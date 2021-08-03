package Arrays;
import java.util.*;
public class Has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int each = 0;

        String result = " ";

       /* for (int i = 0; i < nums.length-1 ; i++) {
            each = nums[i];// set the variable each to be each element in the array

            if (each == 5 && nums[i+1] == 5 ) {// if each equals 5 and the number after i
                // equals 5 then return true otherwise false
                result = "True";

            } else {
                result = "False";
            }
        }
            System.out.println(result);


        */
// in 26-32, two loops will count through the elements of the array,
        // the first one will start from 0 and the second one will start from the
        // iteration of the first loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result = "true";
                } else {
                    result = "false";

                }

            }


        }
        System.out.println(result);

    }
}

/*
Given an array **nums**, print `true` if the array
 contains a 5 next to a 5 anywhere in the array.
If no consecutive 5s or no 5s are detected in your code then print `false`.

```
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
 */