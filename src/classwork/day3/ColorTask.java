package classwork.day3;

import java.util.ArrayList;
import java.util.List;

public class ColorTask {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            System.out.print(color + " ");
        }

        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i));
        }

        System.out.println(colors.get(1));
        System.out.println(colors.get(5));
    }
}
