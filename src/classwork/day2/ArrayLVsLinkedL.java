package classwork.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLVsLinkedL {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            list1.add("aaa" + i);
        }

        System.out.println(System.currentTimeMillis() - t1);

        t1 = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            list2.add("bbb" + i);
        }

        System.out.println(System.currentTimeMillis() - t1);
    }
}
