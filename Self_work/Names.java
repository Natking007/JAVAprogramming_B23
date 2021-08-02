import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        String name = "";
        System.out.println("Please enter name");
            Scanner in = new Scanner(System.in);
            for(int i=0;i<5;i++){
                System.out.println("Do you want to add name?");
                name += in.nextLine();
            }
            System.out.println(name);
        }

    }

