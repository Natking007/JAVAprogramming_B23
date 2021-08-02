package Day07_ShortHand_Relational;
/*
Or logic: If either one is true, result will be true
 true- at least one condition is true
 false- if both condition are false

And logic
  true- if both conditions are true
  false- at least one condition is false
 */


public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println( 10 > 11);// false
        System.out.println( 10 >= 10);// true

        System.out.println(11 >= 9);// true
        System.out.println( 20 >= 200);// false

        // <, <=

        System.out.println( 1000 < 100);// false
        System.out.println( 1000 < 10000);// true

        System.out.println(10000 <= 1000);// false
        System.out.println(1000 <= 10000);// true

        // ==, !=
        System.out.println(5 == 6);// false
        System.out.println(5 != 6);// true

        System.out.println('a' == 'A');// false
        System.out.println('a' != 'A');// true

        System.out.println("Java" == "java");// false: not equal
        System.out.println("Java" != "java");// true: not equal
    }
}
 /*
 > : greater
 >= : greater OR equal( as long as one of the conditions is true it will return true)
  */