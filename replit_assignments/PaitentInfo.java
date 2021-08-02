import java.util.Scanner;

public class PaitentInfo {
    public static void main(String[] args) {
        String firstName,lastName,fullName,email,street,
                state, city, address,contacts;
        int age,zipcode;
        double height, weight;
        boolean isMarried;
        long workPhoneNumber, pesonalPhoneNumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        firstName = keyboard.next();
        System.out.println("Enter your last name");
        lastName = keyboard.next();
        fullName = lastName +", "+ firstName;
        keyboard.nextLine();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = keyboard.next();
        keyboard.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = keyboard.nextLine();

        // continue for city:
        System.out.println("Enter your city");
        city = keyboard.next();
        keyboard.nextLine();
        System.out.println("Enter your state");
        state = keyboard.next();
        System.out.println("Enter your zip code");
        zipcode = keyboard.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = keyboard.nextLong();
        System.out.println("Enter your personal phone number");
        pesonalPhoneNumber = keyboard.nextLong();
        System.out.println("Enter your age");
        age = keyboard.nextInt();
        System.out.println("Enter your height");
        height = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Enter your weight");
        weight = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Are you married?");
        isMarried = keyboard.nextBoolean();
        address= street+", "+city+", "+state+" "+zipcode;
        contacts = "work phone number - "+ workPhoneNumber+", "+ "personal phone number - "+pesonalPhoneNumber+
                ", "+ "email: "+email;
        System.out.println("Patient personal information"+ "\n"+ "Full name: "+fullName+"\n"+
                "Address: "+ address +"\n"+"Contacts: "+contacts+"\n"+"Age: "+age+
                "\n"+"Height: "+height+"\n"+"Weight: "+weight+" pounds"+"\n"+"Married?: "+isMarried);


    }
}
/*
Patient personal information Full name: May, James
 Address: 7925 Jones Branch Dr, McLean, VA 22102
 Contacts: work phone number - 7896542314,
 personal  phone number - 2406542314,
 email: jamesmay@gmail.com
 Age: 35 Height: 5.1 Weight: 173.2 pounds
 Married?: true
 */