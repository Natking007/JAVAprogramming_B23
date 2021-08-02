package Day21Loops;

public class converter_letter_number {
    public static void main(String[] args) {
        String str = "A1B2C3";//digits- 1,2,3
        // 49,50,51(according to the ASCII table the above numbers have these values)
        //(1=49-48),(2=50-48),(3=51-48)
        int sum = 0;
        for (int i = 0; i <str.length()-1 ; i++) {// i:each index number of str
            char each = str.charAt(i);
            if (each >= '0'&& each <='9'){
                sum += each - 48;//<- this right here is how you convert the char to int

            }
        }
        System.out.println("sum = "+sum);
    }

}
/*
. Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
 */
