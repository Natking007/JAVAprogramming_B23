package Day11_Switch;

public class OrlogicInSwitchState {
    public static void main(String[] args) {
        /* months with their days
        28 days:2
        30 days:4,6,9,11
        31 days:1,3,5,7,8,10,12
        Below is an example of how to write OR logic in a switch statement
         */
        int number = 2;
        switch (number) {
            case 2:
            System.out.println("28 days");
            break;// this line here breaks the condition or case that is carrying the 28 days,
                  // since "2"(february) si the only month that has 28 days. If 3 is used here
                  // the compiler will go on to other cases that have that number
                  // thus creating an Or logic in the execution.
            case 4:
            System.out.println("30 days");
            case 6:
            case 9:
            case 11:// these cases(21-23) are left alone or have no statements because they
                   // all contain the same values as case 4, thus the break line will come right
                    // after the cases containing the same values are grouped together.
            break;
            case 1:
            System.out.println("31 days");
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                break;
        }

    }
}
