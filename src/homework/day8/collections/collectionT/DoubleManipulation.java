package homework.day8.collections.collectionT;

import java.util.Arrays;
import java.util.List;

public class DoubleManipulation {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double s : doubles) {
            System.out.print(s + " ");
        }
        double count = 0.1;
        for (double s : doubles) {
            count *= s;
        }
        System.out.println(" ");
        System.out.println("Product of numbers : " + count);

        count = 0.0;
        for (double s : doubles) {
            count += s - (int) s;
        }
        System.out.println(" ");
        System.out.println("Sum of all fractional parts : " + count);

        for (int i = 0; i < doubles.size(); i++)
            System.out.print((int) (double) doubles.get(i) + " ");
    }
}
