package Day09;
// This is an example of a multibranch if statement
public class PosORNeg {
    public static void main(String[] args) {
        int number = 100;
        if(number > 0){
            System.out.println(number+" is positive");
        } else if(number < 0){
            System.out.println(number+" is negative");
        }else{
            System.out.println(number+" is zero");
        }
    }
}
