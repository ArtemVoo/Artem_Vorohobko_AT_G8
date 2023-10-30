package homework.day8.collections.collectionT;

import java.util.ArrayList;
import java.util.List;

public class ElementManipulation {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String s : elements) {
            System.out.print(s + " ");
        }

        System.out.println(" ");

        int count = 0;
        for (String s : elements) {
            if (s.split("\\s+|-").length > 1) {
                count++;
            }
        }
        System.out.println("Number of elements consisting more than one word : " + count);
        System.out.println(" ");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        System.out.println(" ");

        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");

        for (String s : elements) {
            System.out.print(s + " ");
        }
    }
}
