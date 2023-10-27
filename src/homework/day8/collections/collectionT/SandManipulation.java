package homework.day8.collections.collectionT;

import homework.day8.collections.content.Sand;

import java.util.*;

public class SandManipulation {

    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand s : sandbox) {
            System.out.print(s.getWeight() + " ");
        }
        System.out.println(" ");

        for (Sand s : sandbox) {
            System.out.print(s.getName() + " ");
        }
        System.out.println(" ");

        Map<Integer, Sand> emp = new HashMap<>();

        emp.put(5, new Sand(2, "Речной"));
        emp.put(6, new Sand(4, "Речной"));
        emp.put(7, new Sand(2, "Карьерный"));
        emp.put(8, new Sand(7, "Речной"));

        for (int s : emp.keySet()) {
            System.out.println(s + " ");
        }

        System.out.println(" ");

        for (Sand s : emp.values()) {
            System.out.println(s + " ");
        }

        System.out.println(" ");

        for (Map.Entry<Integer, Sand> entry : emp.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ",  Value : " + entry.getValue());
        }
    }
}
