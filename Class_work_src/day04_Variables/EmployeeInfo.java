package day04_Variables;

/*


1. create a class named EmployeeInfo

                1. declare the following variables:
                        firstName,lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                        2. full info of the employee

*/
public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName= "Aaron";
        String lastName = "King";
        String fullName = firstName +" "+ lastName;
        String gender = "Male";
        int age = 25;
        String companyName = "Apple INC";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 11000;


        System.out.println("Employee' full name is " +" "+ fullName);
        System.out.println(fullName +" " + "is"+" "+ gender);
        System.out.println(fullName + " is " + age + " years old"); // for space in b/n texts include in quotation
        System.out.println(fullName +" works at "+ companyName);
        System.out.println(fullName + " job title is "+ jobTitle);
        System.out.println("Is " + fullName +" full time? " + isFullTime);
        System.out.println("Is " + fullName +" married? " + isMarried);
        System.out.println("How much is " + fullName +"'s"+ " salary ?\n" + salary);


    }
}
