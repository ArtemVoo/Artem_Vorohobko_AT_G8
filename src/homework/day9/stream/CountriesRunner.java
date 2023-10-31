package homework.day9.stream;

import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {
        Stream.of("Андора", "Португалия", "Англия", "Замбия")
                .filter(x -> x.matches(".*[аеёиоуыэюя].*")).filter(x -> x.length() < 7)
                .map(String::toUpperCase).map(x -> ("\"" + x + "\"")).forEach(x -> System.out.println(x + " "));
    }
}
