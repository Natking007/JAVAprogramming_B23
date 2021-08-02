package Day15;

public class substringPractice {
    public static void main(String[] args) {
        String sentence = "I love the walking dead";
        String tvSeries = sentence.substring(0,23);
        System.out.println(tvSeries);

        String sentence2 = "java is a fun language";
        String s1 = sentence2.substring(10,12+1);
        System.out.println(s1);

        String s2 = sentence2.substring(14);
        System.out.println(s2);
    }
}
