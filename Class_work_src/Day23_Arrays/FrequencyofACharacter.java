package Day23_Arrays;
// to find the frequency of one character, you repeat them in another
// loop. thus creating a nested loop
// look at frequencyEachCharacter.java
// also look at warm-up task(
public class FrequencyofACharacter {
    public static void main(String[] args) {
        String str = "aabcccdcccccccccccc";

        char ch = 'l';
        int frequency = 0;  // for the frequency of ch

        for (int i = 0; i <= str.length()-1 ; i++) {

            char each = str.charAt(i);// every single characters that we have in str
            if(each == ch ){ // if each character in str is matching with ch
                frequency++; // then increase the frequency of ch by 1
            }

        }

        System.out.println("frequency = " + frequency);



    }
}
