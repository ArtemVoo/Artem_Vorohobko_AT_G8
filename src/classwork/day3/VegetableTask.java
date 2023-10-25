package classwork.day3;

import java.util.ArrayList;
import java.util.List;

public class VegetableTask {

    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String s : vegetables) {
            System.out.print(s + " ");
        }

        int count = 0;
        for (String s : vegetables) {
            if (s.contains("а")) {
                count++;
            }
            System.out.print(s + " ");
        }
        System.out.println("Count of vegetables with 'a': " + count);

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String sss : vegetables) {
            System.out.print(sss + " ");
        }
    }
}

