package homework.day8.collections.collectionT;

import java.util.Arrays;
import java.util.List;

public class BirdManipulation {

    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String s : birds) {
            System.out.println("--" + s + "--");
        }

        System.out.println("---------");

        int count = 0;
        for (String s : birds) {
            if (countVowels(s) > 1) {
                count++;
            }
        }
        System.out.println("Number of birds with more than 1 vowel : " + count);

        System.out.println("---------");

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        System.out.println(" ");

        birds.set(2, "Синица");

        for (String s : birds) {
            System.out.print(s + " ");
        }

    }

    private static int countVowels(String s) {
        int count = 0;

        List<Character> vowels = Arrays.asList('а', 'у', 'о', 'ы', 'э', 'я', 'ю', 'ё', 'и', 'е');
        for (char c : s.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
