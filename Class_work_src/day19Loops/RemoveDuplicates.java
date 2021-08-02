package day19Loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word ="aabbc";
        String result = "";
        if(word.length() ==5) {
            if (!result.contains("" + word.charAt(0))) {//'a'
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(1))) {//'a' // since the result already contains 'a' from the
                                                        // previous statement it will not execute this line since it will
                                                        // be a duplicate. You add the character to a string that does
                                                       // not contain the string, that's how you remove duplicates
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(2))) {//'b'
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(3))) {//'b'
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(4))) {//'c'
                result += word.charAt(0);
            }
        }else if(word.length() > 5){
            System.out.println("Too long");
        }else {
            System.out.println("Too small");
        }


    }
}
/*
 1. ask the user to enter a word. the word must be five characters
 long and print the word without the duplicated characters, but if the word is
 less than five characters long, print "Too Short." and if the word is more than five characters long, print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc
 */