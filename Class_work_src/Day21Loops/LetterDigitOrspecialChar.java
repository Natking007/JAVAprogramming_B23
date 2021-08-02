package Day21Loops;

public class LetterDigitOrspecialChar {
    public static void main(String[] args) {
        String input = "mn@#123Ab!";

        String letters = ""; //mnAb
        String digits = "";//123
        String specialChars = "";//@#!

        for(int i = 0; i<input.length()-1; i++){
            char each = input.charAt(i);// gets each character from the string
            if (each >= 'A'&& each <= 'Z'){// if the  character is  upper case letter
                letters += each;
            }else if (each>='a'&& each <='z'){// if the character is lower case
                letters += each;
            }else if(each>='0'&& each<='9'){// if the character is a number
                digits += each;
            }else{ // if the character is neither letter nor number
                specialChars += each;
            }

        }
        System.out.println("Letters: "+letters);
        System.out.println("Numbers: "+digits);
        System.out.println("Special Characters: "+specialChars);

    }
}
/*
4. write a program that can retive the digits, letters and special
characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
