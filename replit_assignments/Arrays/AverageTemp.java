package Arrays;
import java.util.*;
public class AverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        // Do not touch above. Use array temps
        double average = ((temps[0] + temps[1] + temps[2] + temps[3] + temps[4] + temps[5] + temps[6] + temps[7]) / 8);

        System.out.println(average);
    }
}
