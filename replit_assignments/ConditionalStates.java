import java.util.Scanner;

public class ConditionalStates  {
    static class Main {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String name = inp.nextLine();
            //DO NOT CHANGE ABOVE CODE!  Write your code below
            System.out.println("Input Name:");
            if(name.equalsIgnoreCase("Chen")){
                System.out.println("Teacher");
            }else{
                System.out.println("Student");
            }




        }
    }
}
