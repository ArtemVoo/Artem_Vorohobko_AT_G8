package homework.day9.stream;

import java.util.stream.*;

public class CarsRunner {

    public static void main(String[] args) {
        Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").distinct()
                .filter(x -> x.contains("и")).skip(1).map(String::toUpperCase)
                .forEach(x -> System.out.println(x + " "));
    }
}
