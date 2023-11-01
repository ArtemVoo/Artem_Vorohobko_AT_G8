package classwork.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        String first = list.stream().findFirst().orElse("мама");
        String second = list.stream().filter(x -> x.contains("мама")).findFirst().get();
        String third = list.stream().skip(4).findFirst().get();
        List<String> fourth = list.stream().skip(2).limit(2).toList();
        List<String> fifth = list.stream().filter(x -> x.contains("м")).distinct().toList();
    }
}
