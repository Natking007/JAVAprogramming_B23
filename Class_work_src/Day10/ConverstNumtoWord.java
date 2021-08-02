package Day10;

public class ConverstNumtoWord {
    public static void main(String[] args) {
        int n = 5;
        String word = "";
        if (n >= 0 && n <= 9) { // this pre condition makes and defines the parameters of what
                                // the "n" variable can take.
            if (n == 0) {
                word = "Zero";
            } else if (n == 1) {
                word = "One";
            } else if (n == 2) {
                word = "Two";
            } else if (n == 3) {
                word = "Three";
            } else if (n == 4) {
                word = "Four";
            } else if (n == 5) {
                word = "Five";
            } else if (n == 6) {
                word = "Six";
            } else if (n == 7) {
                word = "Seven";
            } else if (n == 8) {
                word = "Eight";
            } else if (n == 9) {
                word = "Nine";
            }
            else {
                word = "INVALID";
            }
        }
        System.out.println(word);
    }
}
