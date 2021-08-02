package Day15;

public class StringMethod2 {
    public static void main(String[] args) {
        String sentence = "java programming language";
        // index:          0123
        String name = sentence.substring(0,3);
        System.out.println(name);
        //substring does not include the last/ending index

        // but if written like this it will include it
        String name2 = sentence.substring(0,3+1);
        System.out.println(name2);

        String s2 = "Cybertek School";
                 //  01234567
        String name3 = s2.substring(0,7+1);// you have to give the the (beginning index and ending)
                                           // index in the bracket
        System.out.println(name2);
        String name4 = s2.substring(9);
        System.out.println(name4);


        System.out.println("---------------------------------------");
        String sentence2 = "Java is a programming language";
        String name5 = sentence2.substring(10);
        System.out.println(name5);
        String name6 = sentence2.substring(10,20+1);
        System.out.println(name6);

    }
}
