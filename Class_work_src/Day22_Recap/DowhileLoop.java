package Day22_Recap;

public class DowhileLoop {
    public static void main(String[] args) {
        int i = 10;

        while(i < 5){
            System.out.println("Hello cybertek");
        }
        // this will not print "cybertek" since int = 10 and the condition
        // in the while is false.
        System.out.println("----------------------------");

        // do while loop below
         // in this do while loop however there do will always be executed first(regardless of condition)
        // and then it checks condition, thus it will print it one time and then not print
        // because it check the while condition after the do.
        do {
            System.out.println("Hello cybertek");
        }while(i < 5);
    }
}
