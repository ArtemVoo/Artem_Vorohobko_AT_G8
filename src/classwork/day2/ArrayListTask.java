package classwork.day2;


import java.util.ArrayList;
import java.util.List;

public class ArrayListTask {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String str = "мама мыла раму мыла";
        String[] array = str.split(" ");

        for (String s : array) {
            list.add(str);
        }
        System.out.println("---First cycle---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---Second cycle---");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
