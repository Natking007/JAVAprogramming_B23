package Day07_ShortHand_Relational;
/*
 manually calculate the following code fragments:

          1. int a = 100;
             int b = -a++ + ++a - a-- * a-- % 2
 */


public class UnaryPractice {
    public static void main(String[] args) {
        int a = 100; // -100 +
        int b = -a++ + ++a -a-- * a-- % 2;
    }
}
