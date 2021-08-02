package Utilities;

import java.util.Arrays;

public class String_Utility_tools {

    // removes duplicates from a string
    public static String removeDup(String str) {
        String result = "";

        for (char ch: str.toCharArray()) {//toCharArray- returns char array from a String.   String str="ABC",
            // str.toCharArray  =>{'A','B','C'}

            if (result.indexOf(ch) < 0) {

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

        return Arrays.equals(ch1,ch2); // ==> this returns a boolean value

    }

// counts the frequnecy of chars
    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of the str, it is assigned to each
            if(each == ch){
                count++;
            }

        }

        return count;
    }

    // returns the unique character
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

//returns the frequency of each characters, returns strings

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


    // returns the frequency of the word from the sentence
    public static int frequencyOfWord(String sentence, String word){
        int count = 0;  //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while(sentence.contains(word)){
            sentence =  sentence.replaceFirst(word , "");
            count++;
        }

        return count;
    }


}
