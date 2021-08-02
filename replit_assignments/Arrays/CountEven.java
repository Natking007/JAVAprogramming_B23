package Arrays;
import java.util.Scanner;
public class CountEven {

    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
        int[] nums = {1,2,3,4};

        //TODO: Write your code below
        int count = 0;

        for (int i = 0; i <= nums.length-1  ; i++) {
            if(nums[i] % 2 == 0) {// nums[i]= is each element in the array
                    count++;
                }
            }
        System.out.println(count);
            }

            }






/*
Given an array nums, count and print the number of even numbers in the array

Examples:

nums → [2, 1, 2, 3, 4]) → 3

nums → [2, 2, 0, 3, 5]) → 3

nums → [1, 3, 5, 7, 9]) → 0
 */