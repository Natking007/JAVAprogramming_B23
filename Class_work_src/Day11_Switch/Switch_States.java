package Day11_Switch;
// In this example we are doing days in a week with switch statements
public class Switch_States {
    public static void main(String[] args) {
        int number = 5;  // The value that is stored here should match the number of case statements available.
        switch (number){  // Here you give the variable to the switch statement, which has to be an int,
                          // since the data type of the local variable is an integer
            case 1:
                System.out.println("Monday");
                break;// case 1 is closed at this line
            case 2:
                System.out.println("wednesday");
                break;
            case 3:
                System.out.println("Thur");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:  // If the number variable is holding a number that is
                // above the number of cases statements present then it will execute the default
                System.out.println("INVALID");
        }
    }
}
