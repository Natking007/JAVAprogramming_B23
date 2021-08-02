package Day23_Arrays;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.println("---------------------------------------");
        System.out.println("below is a nested loop version of the above ");
        for(int j = 6; j <= 10; j++){ // outer loop
            for (int i = 1; i <= 5 ; i++) { // inner loop
                System.out.print(i+" ");
            }
            System.out.println();

        }





    }


}

