package day06;
/*
+ = plus operator, indicates postive value
- = minus operator, indicates negative value
++ = increment operator, increases value by 1
-- = decrement operator, decreases value by 1
 */
public class UnaryOperators {
    public static void main(String[] args) {
        int a = 100;
        ++a; //this is called a pre-increment(change value immediately)
        // b/c the operator comes before the variable
        System.out.println("a = "+ a);

        int b = 100;
        --b;
        System.out.println("b = " + b);

        int c = 60;
        c--;
        System.out.println("c = " + c);

        int d = 60;
        d++; // this is called postincrement
        // (change value after checking value, delayed the increment)
        System.out.println("d = " + d);

        System.out.println("---------------------");
        int x = 10;

        System.out.println("_--------------------------");
        int n1 = 50;
        int n2 = n1++;// since this is post increment 50 will be assigned/passed to n2 first
        System.out.println("n1 = " +n1);
        System.out.println("n2 = " + n2);

        int a1 = 100;
        int a2 = ++a1;
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        System.out.println("-----------------");
        int r = 200;

        System.out.println(r++);//200. is delayed
        System.out.println("r = " + r);//201

        int p = 200;
        System.out.println(++p); // 201. right away
        System.out.println("p = " + p);

        System.out.println("-----------");
        int y = 100;
        int result = y++ + 1;
        System.out.println("y = " + y);
        System.out.println("result = " + result);
        // y= 101
        // result = 100, since this is a post increment

        int z = 100;
        int result2 = ++z + 1;// this preincrement is immediate
        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);
        // this time
        // z = 101 and result2 = 102
     // this difference is b/c of the preincrement that is applied to z




    }
}
