package homework.day8.collections.collectionT;

import homework.day8.collections.content.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubbleManipulation {

    public static void main(String[] args) {

        List<Bubble> bubbles
                = Arrays.asList(new Bubble(2, "CO2"),
                new Bubble(4, "O2"), new Bubble(5, "CO"));
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }

        System.out.print(" ");

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }

        System.out.println(" ");

        int totalVolume = 0;
        for (Bubble bubble : bubbles) {
            totalVolume += bubble.getVolume();
        }
        System.out.println("Total volume of bubbles : " + totalVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
