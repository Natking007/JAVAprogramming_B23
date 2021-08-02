package Day31_Recap;


import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {
        String str = "MMMMMMMMMNNNNNNBBBBBAAAZZZZZZDDDDD";

        System.out.println(removeDup(str));
        // or
        String r = removeDup(str); // calling the remove duplicates method
        System.out.println(r);


        System.out.println("---------------------------");

        // here we call the isAnagram method

        String str1 = "heart",
                str2 = "earth";

        System.out.println(isAnagram(str1, str2)); // parameter contains the values you want to be tested by the
        // by the function/method


        System.out.println("-----------------------------");
        String word ="MMMMMMMMMNNNNNNNNAAAAAA";

        int n1 = frequency(word,'M'); // since I want to find the freqency of the char "M"

        System.out.println("n1 ="+n1);

        System.out.println("-----------------------------");

        String s = "aaaaabcccccdeeeeef";

        String unique ="";

        for (int i = 0; i <s.length() ; i++) {
            char each = s.charAt(i);
            int frequency = frequency(s,each);
            if(frequency == 1){
                unique+= each;
            }

        }
        System.out.println(unique);


    }


    public static String removeDup(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {//toCharArray- returns char array from a String.   String str="ABC",
            // str.toCharArray  =>{'A','B','C'}

            if (!result.contains("" + ch)) {

                result += ch;
            }
            // result.indexof(ch) < 0, this another way to do it, if the indexof is a negative number
            // it means the character is not there
            // if the character is not contained in the result, then
            //concatonate the character

        }


        return result;
    }


    // "heart" & "earth"==> isAnagram ==> true
    public static boolean isAnagram(String str1, String str2) {

        char[] ch1 = str1.toCharArray(); // single out each character{"h","e","a","r","t"}

        char[] ch2 = str2.toCharArray();//{"e","a","r","t","h"}

        Arrays.sort(ch1);// then sort them is order{"a","e","h","r","t"}
        Arrays.sort(ch2);//{"a","e","h","r","t"}

        return Arrays.equals(ch1, ch2); // ==> this returns a boolean value

    }

    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of the str, it is assigned to each
             if(each == ch){
                 count++;
             }

        }

        return count;
    }

    public static String uniqueChars(String s) {

        String unique = "";

        for (int i = 0; i < s.length() -1 ; i++) {

            char each = s.charAt(i);
            int frequency = frequency(s,each);// called the previous method used to find the frequency
                    // this way we can add to the unique if the frequency is equal to one.
                    if(frequency ==1){
                        unique += each;
                    }

        }

        return unique;

    }

    //frequencyOfChars("AAABBBBCC") ==> A3B4C2
    public static String frequencyOfChars(String str){
        String result = ""; //A3B2C4

        for (char each : removeDup(str).toCharArray()) { // each: A, B C. Removes duplicates by calling that method
            // and then puts it in the charArray (in to an array)
            int frequency =  frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each ; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }







}












    /*public static String frequency(String str, char ch) { // it is not 'void' because I want to be able
        // to use it and I need it to return string.
        String word = "";
        int count = 0;
        for (int i = 0; i <= word.length() ; i++) {
            char each = word.charAt(i);
            if (each == word.charAt(i)){
                count = count+1;
            }

        }
    */



/*
1. Write a return method named frequency that accepts two parameters:
 String and Char. then returns the frequency of the char from the string
            Ex:
                frequency("AAABB", 'A');  ==> 3

 */