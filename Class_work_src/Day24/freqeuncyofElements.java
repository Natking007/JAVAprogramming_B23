package Day24;

public class freqeuncyofElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};
        for (int j = 0; j < arr.length; j++) {
            int element = arr[j];
            int count = 0;// stores the frequency of the above variable (int element)
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    count++;
                }
            }
                if (count == 1) {// to check if the elements if unique
                    System.out.println(element+" ");
                }

        }
    }
}
/*
write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */
