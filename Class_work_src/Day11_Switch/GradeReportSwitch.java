package Day11_Switch;
// this is another example that uses OR logic with the switch states.
// by grouping the conditions or cases that have the same value and then ending them with a
// "break" keyword
public class GradeReportSwitch {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade){
            case 'A':
            case'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
        }
    }
}
