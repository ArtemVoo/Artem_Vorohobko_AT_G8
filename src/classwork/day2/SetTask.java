package classwork.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {

    public static void main(String[] args) {

        Set<String> MySet = new HashSet<>();

        String str = "мама мыла раму мыла";
        String[] array = str.split(" ");

        for (String s : array) {
            MySet.add(s);
            System.out.println(s);
        }
        Iterator<String> iterator = MySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for(String set : MySet){
            System.out.println(set);
        }
    }
}
