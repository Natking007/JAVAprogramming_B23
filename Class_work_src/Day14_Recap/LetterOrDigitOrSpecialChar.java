package Day14_Recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {
        char ch = 'O';
        boolean isDigit = ch >= 48 && ch <= 57;
        boolean isLetter = (ch >= 65 && ch <= 90) && (ch >= 97 && ch <= 122);// if the character is upper case
                                                                             // or lower case letter
        // booelan isSpecialCharacter = !isDigit && !isLetter;
        String result = "";
        if(isDigit){
            result = ch+ " is digit";

        }else if (isLetter){
            result = ch+" is letter";

        }else{
            result = ch+" is special character";
        }
        // the ternary from of it would be
        /*
        String result = (isDigit)? ch+" is digit" :(isLetter)? ch+ " is Letter": ch+ " is special character";
         */

    }
}
