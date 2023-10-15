package homework.day4.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance(){
        Random random = new Random();
        int x = random.nextInt(100);
        String str = String.format("DistanceGenerator: I have generated distance with value: %d", x);
        System.out.println(str);
        return x;
    }
}
