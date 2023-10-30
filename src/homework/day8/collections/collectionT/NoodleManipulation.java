package homework.day8.collections.collectionT;

import java.util.ArrayList;
import java.util.List;

public class NoodleManipulation {

    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String s : noodles) {
            System.out.print(s + "-");
        }
        System.out.println(" ");

        for (int i = 0; i < noodles.size(); i++) {
            String s = noodles.get(i);
            s = s.replace("a", "o");
            noodles.set(i, s);
        }
        for (String s : noodles) {
            System.out.print(s + " ");
        }
    }
}
