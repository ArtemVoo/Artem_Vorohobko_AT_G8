package homework.day8.collections.collectionT;

import java.util.ArrayList;
import java.util.List;

public class CountryManipulation {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String s : countries) {
            System.out.print(s + ",");
        }

        System.out.println();

        int count = 0;
        for (String s : countries) {
            if (s.length() < 7) {
                count++;
            }
        }
        System.out.println("Number of countries with name less than 7 letters : " + count);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
