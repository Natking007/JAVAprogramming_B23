package Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        int[] nums = new int[size];



        for (int i = 0; i < size; i++) {

            nums[i] = scan.nextInt();

            int[] newnum2 = new int[nums.length*2];// doubling the new array based on size of previous array

            int lastInt = nums[nums.length-1];// lastInt equals the last element of the num array

            newnum2[newnum2.length-1] = lastInt;// the new arrays last element = lastInt

            System.out.println(Arrays.toString(newnum2));

        }

        //int[] nums2 = new int[nums.length*2];

        // the last element of the new array is equal to the
        // last element of the first array.

        //System.out.println(Arrays.toString(nums2));

        //int [] nums2 = new int[nums.length*2];

        //nums[i] = nums2[i+1];
        // System.out.print(Arrays.toString(nums2));
    }
    }

/*
Given an int array nums print a new array with double the length where
its last element is the same as the original array, and all the other elements are 0.
 The original array will be length 1 or more. Hint: by default, a new int array contains all 0's.

Examples:

input: 4 5 6

output: [0, 0, 0, 0, 0, 6]

input: 4 5 6

output: [0, 0, 0, 0, 0, 6]

input: 0

output: [0, 0]

input: 0

output: [0, 0]

input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]
 */
