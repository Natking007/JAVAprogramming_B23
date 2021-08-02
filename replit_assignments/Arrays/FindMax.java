package Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
          int max = arr[0];
        for (int i = 0; i <= arr.length-1 ; i++) {

           int each = arr[i];//each element in the array (arr);

            if(each > max){

                max = each;
            }

        }
        System.out.println(max);
    }
    
}

/*
Given an array num, get the max number in the array and print it out to the console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33
nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33
hint:

create a variable called max and before you start searching assume the first item value is the max.

loop through each and every item and check for whether the value max is less than the item value.

if so assign the value to the max to overwrite existing max.

you will get the max value when you are done with the loop
 */
