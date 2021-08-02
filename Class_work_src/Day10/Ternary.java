package Day10;

public class Ternary {
    public static void main(String[] args) {
        int n = 100;
        String result ="";
        if (n % 2 == 0){
            result = "even";
        }else{
             result = "odd";
        }
        System.out.println("---------------------");
        String result2 = (n%2 == 0)? "Even":"odd";

    }
}
