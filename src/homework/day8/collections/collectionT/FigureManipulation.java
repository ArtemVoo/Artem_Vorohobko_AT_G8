package homework.day8.collections.collectionT;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FigureManipulation {

    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        for (String s : figures) {
            try {
                FileWriter writer = new FileWriter("D://figures.txt", true);
                writer.write(s + "-");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        int count = figures.size();
        for (String s : figures) {
            if (s.contains("и")) {
                count--;
            }
        }
        System.out.println("Count of figures is not contain 'и' : " + count);

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        figures.set(3, "Треугольник");

        for (String s : figures) {
            System.out.print(s + " ");
        }
    }
}


