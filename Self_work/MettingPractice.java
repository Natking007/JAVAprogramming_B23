public class MettingPractice {
    public static void main(String[] args) {
        System.out.println("Hello Group");
// Day 01
        System.out.println("--------------------------");
        double gallons = 5000;
        double liters = gallons * 3.78;
        System.out.println(gallons);

        System.out.println("--------------");
        String name = "Omar";
        int bNum = 2867;
        String streetAdd = "old lee highway";
        int Zip = 22153;
                String city = "Fairfax";
                String state = "VA";
        System.out.println(name + "\n" +  bNum + " "+ streetAdd + "\n" + Zip + " " + city+ " " + state);

        System.out.println("----------------------------");
        // byte a=30;
        // int b =b+= a; what’s the value of b

        byte c = 30;
        int b = 5;
        int sum = c + b;

        System.out.println("-----------------------------");
          int x = 2;
           int y = x++;
        System.out.println(y);

        int z = 2;
        System.out.println(z++);

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        System.out.println(a);


        System.out.println("-----------------");

        String s1 = "I love";
        String s2 = "me";
        System.out.println(s1.concat(" "+s2));

    }
}
