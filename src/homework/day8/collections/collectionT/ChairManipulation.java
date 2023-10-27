package homework.day8.collections.collectionT;

import homework.day8.collections.content.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairManipulation {

    public static void main(String[] args) {
        List<Chair> furniture
                = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        for (Chair s : furniture) {
            System.out.print(s.getHeight() * s.getWidth() + " ");
        }
        System.out.println(" ");

        Map<Integer, Chair> emp = new HashMap<>();

        emp.put(5, new Chair(1, 2));
        emp.put(6, new Chair(4, 2));
        emp.put(7, new Chair(2, 4));

        for (int s : emp.keySet()) {
            System.out.println(s + " ");
        }

        System.out.println(" ");

        for (Chair s : emp.values()) {
            System.out.println(s + " ");
        }

        System.out.println(" ");

        for (Map.Entry<Integer, Chair> entry : emp.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ",  Value : " + entry.getValue());
        }
    }
}
