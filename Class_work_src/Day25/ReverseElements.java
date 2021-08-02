package Day25;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {
        String [] array ={"Java","Python","C#"};
        for (int j = 0; j < array.length ; j++) {// j: index numbers of the array
            String element = array[j];
            String reverse = "";
            for (int i = element.length()-1; i >= 0 ; i--) {//i: index numbers of the string
                // this inner loop is responsible for reversing it and assigning it to the
                // string.
                reverse += element.charAt(i);// gets the characters from the string element
            }
            array[j] = reverse;// assigning reversed elements to the index of the array
        }
        System.out.println(Arrays.toString(array));
    }
}
/*
1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}
	    	output:
	    		["avaJ", "nohtyP", "#C"]
 */