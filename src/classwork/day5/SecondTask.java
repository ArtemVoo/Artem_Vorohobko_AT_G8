package classwork.day5;

import java.util.Arrays;
import java.util.List;

public class SecondTask {

    public static void main(String[] args) {
        List<Person> list
                = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        list.stream().filter(x -> x.age > 18).filter(x -> (x.age < 60 && x.sex == Person.Sex.MAN) || (x.age <= 55))
                .count();


        int count = 0;
        for (Person x : list) {
            if ((x.age > 18 && x.age < 55) || (x.sex == Person.Sex.MAN && x.age > 18 && x.age < 60)) {
                count++;
            }
        }
    }
}




