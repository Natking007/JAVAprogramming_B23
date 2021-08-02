package Day08;

public class Single_ifstatement {
    public static void main(String[] args) {
        int score = 95;
        boolean passed = score >= 68;

        if(passed){

            System.out.println("Congrats");
        }

        if (!passed){
            System.out.println("You have failed");
        }


    }

}
