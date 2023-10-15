package homework.day4.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random = new Random();
        int x = random.nextInt(80);
        String str = String.format("CoordinatesGenerator: I have generated point with value: %d", x);
        System.out.println(str);
        return x;
    }
}
