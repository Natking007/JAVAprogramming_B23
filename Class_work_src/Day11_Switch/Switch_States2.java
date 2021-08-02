package Day11_Switch;
// In this example we are selecting which browser to use
public class Switch_States2 {
    public static void main(String[] args) {
       int z = 12;
        switch (z){ // data type of local variable is a string
            case 10 :
                System.out.println("chrome browser is selected");

            case 11:
                System.out.println("firefox is selected");

            case 12:
                System.out.println("edge is selected");
            default:
                System.out.println("We don't have other browsers");

        }
    }
}
