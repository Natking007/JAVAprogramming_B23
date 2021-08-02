package day06;

public class PostPrePractice {
    public static void main(String[] args) {
        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        // a= -1 + 0 / -1 * -1

        // a = negative post decrement of "a" plus post increment of "a" divided by
        // negative post decrement of "a" times pre decrement of "a".

        int x = 10;
        x = ++x;

        int y = 50;
        int z = -y++ + --y - ++y + y--;
        // z = -50 + 50 - 51 + 51


    }
}

