package Day23_Arrays;

public class nestedLoop2 {
    public static void main(String[] args) {

        for (int j = 1; j <= 6; j++) {// this outer loop is responsible for
            // for printing 20(*) in 6 different lines
            for (int i = 0; i < 20; i++) {// this inner loop is responsible for
                System.out.print("*");// printing 20((*)
            }
            System.out.println();// this appends a new line after
            // printing 20 lines
        }

        System.out.println("----------------------------------------");

        for (int j = 1; j <= 8 ; j++) {//j=number of lines
            for (int i = 1; i <=j ; i++) {//i= number(*) in each line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
