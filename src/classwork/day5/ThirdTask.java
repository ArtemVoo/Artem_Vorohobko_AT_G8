package classwork.day5;

import java.util.Arrays;
import java.util.List;

public class ThirdTask {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        boolean first = list.stream().anyMatch("мама"::equals);
        boolean second = list.stream().allMatch(x -> x.contains("м"));
        List<String> third = list.stream().map(x -> x + "_м").toList();
        list.stream().flatMap(x -> Arrays.stream(x.split("а")))
                .filter(x -> !x.equals("")).toList().forEach(System.out::println);
    }
}
