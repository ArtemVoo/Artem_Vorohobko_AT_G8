package homework.day9.stream;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {
        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").toList();

        figures.stream().map(String::length).filter(x -> x > 4).forEach(System.out::println);
    }
}
