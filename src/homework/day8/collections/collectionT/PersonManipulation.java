package homework.day8.collections.collectionT;

import homework.day8.collections.content.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonManipulation {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        for (Person x : people) {
            System.out.print(x.getAge() + " ");
        }
        System.out.print(" ");

        for (Person x : people) {
            System.out.print(x.getName() + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
