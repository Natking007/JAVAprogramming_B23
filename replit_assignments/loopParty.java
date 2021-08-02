import java.util.Scanner;

public class loopParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guest1 = "Nick";
        String guestName = "";
        String userAnswer = "";
        do {
            System.out.println("Please enter guest name");
            guestName += "," + scan.next();
            System.out.println("Do you want to add new guest?");
            userAnswer = scan.next();

        } while (userAnswer.equalsIgnoreCase("Yes"));
        System.out.println("Guest's name is:" + guest1 + guestName);

    }
}



/*
Imagine you have a party and need to
form the list of the guests.
(Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

 If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

```
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
```
 */
