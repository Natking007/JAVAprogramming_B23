package day06;
/*
Operator Precedence:
highest: *,/,%
lowest: -,+

To give precedence to the lowest operators, like if you wanted to add before dividing.
You have to group them in a bracket ().
eg

2*3 will come after (2+3), if the bracket is removed 2*3 will take place first.

2+3 * 10 = 32
(2+3) * 10 = 50

 */
public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println("Addition" + 2 + 3);
        // "Addition
    }
}
