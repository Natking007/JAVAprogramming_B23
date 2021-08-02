package Day16;

public class StringMethods {
    public static void main(String[] args) {
        String email = "Cybertek@yahoo.com";
      // email.replace("yahoo", "gmail"); // in this way of writing, there will be no replacement since
                                                    // the email variable has not been reassigned.
        email = email.replace("yahoo", "gmail");// reassignment
        System.out.println(email);
        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replaceFirst("C# is f", "java is F");// replace the first matching only
        sentence = sentence.replaceFirst(", C#", ", JAVA");// replaces the second "c#"

        System.out.println(sentence);
        System.out.println("----------------------------------------");
        String sentence2 = "Java is a cool language";
        int indexOfFirstA = sentence2.indexOf("a");// first A
        int indexOFSecondA = sentence2.indexOf("a ");//second A
        int indexOFThirdA = sentence2.indexOf("an");// third A
        int indexOfFourthA = sentence2.indexOf("ag");// fourth A
        System.out.println(indexOfFirstA);
        System.out.println(indexOFSecondA);
        System.out.println(indexOFThirdA);




    }
}
