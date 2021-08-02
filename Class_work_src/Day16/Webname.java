package Day16;

public class Webname {
    public static void main(String[] args) {
        String url = "www.amazon.com";
        String name = url.substring(url.indexOf(".")+1 , url.lastIndexOf("."));
        String domain = url.substring(url.lastIndexOf("."));
        // another way to write line 6
        // int beginning = url.indexOf(".")+1;
        // int end = url.indexOf(str ".");
        // String name = url.substring (beginning, end);
        System.out.println(name);


        System.out.println("_________isEmpty Method_______________________________");
        String s2 = "         ";
        s2 = s2.trim();
        boolean r1 = s2.isEmpty();
        System.out.println("r1 = " + r1);

        System.out.println("--------------Equals() or equalsIgnoreCase()--------------");
        String str1 = "Cat";
        String str2 = new String("Cat"); // Java Heap
        String str3 = new String("cat");
        System.out.println(str1 == str2 );// false
        System.out.println(str1.equals(str2));// true
        System.out.println(str2 == str3);// false
        System.out.println(str2.equals(str3));// false, since there is a difference in the words.
        System.out.println("------------------------------------------");
        String word1 = "JAVA";
        String word2 = "JAVA";
        System.out.println(word1 == word2);// true, since the cases are the same. They are both saved in one
                                            // memory location since duplicates are not allowed to have more than one room
        System.out.println(word1.equals(word2));// true

        String word3 = "JAVA";
        String word4 = "jAVA";
        System.out.println(word3== word4);// false, since there is difference in case
        System.out.println(word3.equals(word4));// false since the cases are different
        System.out.println(word3.equalsIgnoreCase(word4));// true, since this method don't give a damn about the case








    }
}
