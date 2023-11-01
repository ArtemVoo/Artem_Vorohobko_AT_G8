package classwork.day5;

import java.util.Arrays;
import java.util.List;

public class FourthTask {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().sorted().toList().forEach(System.out::println);
        list.stream().sorted((x,y) -> - x.compareTo(y)).distinct().toList().forEach(System.out::println);
        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split("")))
                .peek(System.out::println).max(String::compareTo).get());
    }
}
