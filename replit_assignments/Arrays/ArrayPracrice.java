package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPracrice {
    public static void main(String[] args) {
        /* Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i <size ; i++) {
            nums[i] = scan.nextInt();
           // System.out.print(i+" ");// this prints out the index numbers of each element
        }
        int newNums[] = new int[nums.length*2];
        newNums[newNums.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(newNums));

        System.out.println("--------------------------------------------");

        int size2 = scan.nextInt();
        int [] num = new int[size2];

        for(int i = 0; i < size; i++){
            num[i] = scan.nextInt();
            int arr[] =new int[2];
            arr[i] = num[i];
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("--------------------------------------");
*/
        int a[] = { 1, 8, 3 };

        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];

        // Copy elements of a[] to b[]
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];

        // Change b[] to verify that
        // b[] is different from a[]
        b[0]++;

        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");



    }
}
