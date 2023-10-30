package homework.day8.collections.collectionT;

import java.util.ArrayList;
import java.util.List;

public class ButterflyManipulation {

    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String s : butterflies) {
            System.out.println("\"" + s + "\"");
        }

        int count = 0;
        for (String s : butterflies) {
            if (s.contains("o")) {
                count++;
            }
        }
        System.out.println("Count of butterflies with 'o' :" + count);

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        System.out.println("-------------");

        for (String s : butterflies) {
            System.out.println(s);
        }
    }
}
