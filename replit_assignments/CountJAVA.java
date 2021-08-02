import java.util.Scanner;

public class CountJAVA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        int wordCounter = 0;

        for (int i = 0; i <= userInput.length()-4 ; i++) {
            String eachWord = userInput.substring(i,i+4);
            if(eachWord.equals("java")){
                wordCounter++;
            }

        }
        System.out.println(wordCounter);
    }
}
