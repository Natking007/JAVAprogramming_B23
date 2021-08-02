package Day07_ShortHand_Relational;

/*
write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10
 */

public class SwipeTwoNumbers {
    public static void main(String[] args) {
        int a= 200;
        int b = 300;

        int c = a;  //200;

        a = b; // a = 300
        // After this step, since JAVA calculates form top to bottom
        // variable "a" will not have the original value. It will have "b"
        // value(300). In order to get "a" original value look at variable "c"
        // which has been assigned the original value.
        b = c; //b = 200



        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
