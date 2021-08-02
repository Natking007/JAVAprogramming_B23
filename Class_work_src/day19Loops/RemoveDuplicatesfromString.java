package day19Loops;

public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        String word = "ababababababa";
        String result ="";//"ab"
        for (int i = 0; i<= word.length()-1 ; i++) {
            // so this counts through the length of the word and keeps it going as long as there
            // is letters available in the string word, increasing it by one as it goes so as to keep
            //count of iteration
            // for index(word) position minus 1 as long as index is less than or equal to the whole
            // word length(index increases by 1(post increment, i++))
            if(!result.contains(""+word.charAt(i))){
                // if result does not contains the character of the word where (i) is at then  print.
                // so it will look at 'a' then pass it to result, then it will look at
                //'b' then pass to result then it will look at 'a' again, this time it will say since the
                // result already contains 'a' I wont pass it.
                // a condition which checks weather the result contains the specific
                                                   // character we are looking for the specific (i)
                                                   // we are looking for
                result += word.charAt(i);
            }

        }
        System.out.println("result = "+result);
    }
}
