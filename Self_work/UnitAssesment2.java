import java.util.*;
public class UnitAssesment2 {
    public static void main(String[] args) {

        String str = "I love reading books";
        String word = "";

        for (int i = str.length()-1; i <= 0 ; i--) {
            word += str.charAt(i);
        }
        System.out.println(word);

        String word2 = "  winter is coming   ";
         word2 = word2.trim();
        System.out.println(word2.length());

        System.out.println("----------");
        byte [] b2 = new byte[5];
        for (int i = 0; i < b2.length ; i++) {
            b2[i] = (byte)(b2[i]*2);
            System.out.println(b2);
        }

        System.out.println("_____________");

        int num = 5;
        while(num < 100 ){
            num += num;
        }
        System.out.println(num);


        System.out.println("-------------");
        int a = 0;
        do{
            a = a++ + --a -(a%3);

        }while (++a<4);
        System.out.println(a);

        System.out.println("-------------");

        int [] nums = new int[5];
        int b = 5;

        nums[2] = b--;
        nums[0] = b * 2;
        nums[4] = --b + (b-9);
        nums[1] = nums[2];
        nums[3] = nums[b-3];
        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------");

        String str2 = "cybertek";

        for(int i = 0; i <= str.length(); i+=2){
            System.out.println(str2.charAt(i));
        }

        System.out.println("------------------");



    }




}
