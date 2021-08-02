import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seniorCitizens, nonSeniorCitizens,age;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = scan.nextInt();
        nonSeniorCitizens=scan.nextInt();
        System.out.println( "What is new citizen's age?");
        age = scan.nextInt();
        if(age>=65){
            System.out.println("Senior Citizen");
            System.out.println("New senior Citizens count "+(seniorCitizens+1));
        }else if(age<=65){
            System.out.println("non Senior Citizen");
            System.out.println( "New nonSeniorCitizens count "+(nonSeniorCitizens+1));

        }
    }
}
/*
1. Declare int variables: seniorCitizens, nonSeniorCitizens, age
2. Create a Scanner object
3. Ask user to enter count for seniorCitizens and
nonSeniorCitizens using message:

  "Enter current count for seniorCitizens and nonSeniorCitizens:"

4. Ask user to enter age:

  "What is new citizen's age?"

- if citizen's age is more than or equals to 65 then print "Senior Citizen"
and increment seniorCitizens variable by 1.

- if citizen's age is less than 65 then print "Non-Senior Citizen" and
increment nonSeniorCitizens variable by 1.

5. Last print another message:

  "New seniorCitizens count ValueOfVariable"

  "New nonSeniorCitizens count ValueOfVariable"

Example:

```
Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
```


 */
