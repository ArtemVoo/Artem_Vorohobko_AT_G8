package homework.day8.collections.collectionT;

import java.util.ArrayList;
import java.util.List;

public class CityManipulation {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String s : cities) {
            System.out.println(s);
        }
        int sum = 0;
        for (String s : cities){
            sum += s.length();
        }

        System.out.println("Sum of all letters : " + sum);

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
