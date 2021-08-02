package Day15;

public class Reverse {
    public static void main(String[] args) {
        String word = "table",
         // index =    01234
        result = "";
        if(word.length() > 5 ){
           result = "too long";
        }else if (word.length()<5){
            result = "too short";
        }else{   // this what is called reversing, the variable "word" is reversed and saved in "result"
            result += word.charAt(4);// this is the letter e in the word table and so on.....
            result += word.charAt(3);// you can also write this using one line by concatenation
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        }
        System.out.println(result);

    }
}
