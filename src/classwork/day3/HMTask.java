package classwork.day3;

import java.util.HashMap;
import java.util.Map;

public class HMTask {

    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<>();
        String[] arr = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < arr.length; i++) {
            words.put(i, arr[i]);
        }
        for (int i : words.keySet()) {
            System.out.println(i);
        }
        for (String s : words.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
