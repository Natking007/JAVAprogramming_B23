package Day11_Switch;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 2.5;
        char mathOperator = '-'; // +,-,*/
        double result = 0;
        switch (mathOperator){
            case '-':
              result = n1 - n2;
                break;
            case '+':
                result = n1 * n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1/n2;
                break;
            default:
                System.out.println("result =");

        }
    }
}
