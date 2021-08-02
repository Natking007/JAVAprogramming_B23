package Day26_RECAPandMultidimensional;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 10, 11};

        for (int element : arr2) {// gets the element of
            // arr2
            for (int each : arr1) {// each:1,2,3,4,5. gets the element of arr1
                if (each == element) {
                    System.out.println(each);
                }

            }

        }

        System.out.println("----------with regular for loop-----------");

        for (int i = 0; i < arr2.length; i++) {// i: index of the arr2
            for (int j = 0; j < arr1.length; j++) {// j: index of the arr1

                if (arr2[i] == arr1[j]) {
                    System.out.println(arr1[j]);// it doesnt matter whether you tell
                    // it to print arr1 or arr2. Both garner the same
                    // result
                    break;
                }

            }
        }
    }
}
