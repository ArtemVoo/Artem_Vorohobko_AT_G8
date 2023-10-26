package homework.day8.collections.collectionT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberManipulation {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (int s : numbers) {
            System.out.println(s + " ");
        }
        int count = 0;
        for (int s : numbers) {
            count += s;
        }
        System.out.println("Sum : " + count);

        Collections.sort(numbers);
        for (int s : numbers) {
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println(" ");

        Collections.reverse(numbers);
        for (int s : numbers) {
        }
        for (int s : numbers) {
            System.out.print(s + " ");
        }
    }
}
