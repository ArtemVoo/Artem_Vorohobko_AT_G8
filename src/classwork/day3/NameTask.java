package classwork.day3;

import java.util.ArrayList;
import java.util.List;

public class NameTask {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String s : names) {
            System.out.print(s + " ");
        }

        names.set(2, "Оля");
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.remove("Оля");
        names.remove(3);

        for (String ss : names) {
            System.out.print(ss + " ");
        }
    }
}

