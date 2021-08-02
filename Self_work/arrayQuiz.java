import java.util.Arrays;

public class arrayQuiz {
    public static void main(String[] args) {
        char[] array = {'D','C','A','B'};
        Arrays.sort(array);
        for (char each:array) {
            System.out.println(each+"");
            if(each=='D'){
                continue;
            }

        }

        System.out.println("---------------");

        int[] num1 = new int[3];
        int [] num2 ={1,2,3,4,5};
        num1=num2;
        for (int i = 0; i <num1.length ; i++) {
            System.out.println(num1[i]);

        }

        System.out.println("-------------");
        String[] planets = {"M","V","E","M"};
        int x = planets.length;
        int y  = planets[1].length();
        System.out.println(x+" "+y);

    }
}
