package Day25;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4},
                arr2 ={5,6};
        int[] arr3 = new int[arr1.length+ arr2.length];// setting the length of the arr3 so that it
                           // it can contain the desired number of elements

        int j =0;// for index number of arr3, declared outside  so that it can be passed to both loops below
        for(int i = 0; i < arr1.length;i++){
            arr3[j++] = arr1[i];// retrieves each element from arr1 and assignees to the index of arr3
    }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[j++] = arr2[i];// retrieves each element from arr1 and assigns to the index of arr3
        }
        System.out.println(Arrays.toString(arr3));
    }
}
