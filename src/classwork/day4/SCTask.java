package classwork.day4;

import java.util.Arrays;
import java.util.List;

public class SCTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
    }
}




