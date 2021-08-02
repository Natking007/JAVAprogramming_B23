package Day24;
import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String sentence = "I love learning java programming language";
        String [] words = sentence.split(" ");
        /*
        split(value): returns string array, splits the string by given value

		sentence = I love Java programming
		sentence.split(" "); ==> {"I", "love", "Java", "programming"}

				programming Java love I

         */
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1 ;i >= 0; i--) {
            System.out.print(words[i]+" ");
        }


    }
}
