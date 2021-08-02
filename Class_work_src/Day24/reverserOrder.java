package Day24;

import java.util.Arrays;

public class reverserOrder {
    public static void main(String[] args) {
        int[] numArr ={1,2,3,4,5};
        int[] reversedArr =new int[numArr.length]; // we do this so that the reversedArr can
        // contain the elements of the numArr array.
        /*
        ** This what manually reversing the order of elements looks like ****
        reversedArray[0] = numArr[4];
        reversedArray[1] = numArr[3];
        reversedArray[2] = numArr[2];
        reversedArray[3] = numArr[1];
        reversedArray[4] = numArr[0];

         */
        for (int i = numArr.length-1, j = 0; i >= 0 ; i--,j++) {
          // i is the index numbers of array starting from last index
            // j us the index numbers of reversedArray starting from index 0
            reversedArr[j] = numArr[i];
        }
        System.out.println(Arrays.toString(numArr));// this method(Arrays.toString) is what is
          // used to print arrays.
        System.out.println(Arrays.toString(reversedArr));

    }
}
/*
 Write a program that can reverse an array of integers
		ex:
			array = {1,2,3,4,5};

		output:
			reversedArray = {5,4,3,2,1};

 */
