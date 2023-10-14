package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random random = new Random();
        int x = random.nextInt(39) + 1;

        if (x > 1 & x < 10) {
            return "NORTH";
        } else if (x >= 10 & x < 20) {
            return "SOUTH";
        } else if (x >= 20 & x < 30) {
            return "WEST";
        } else if (x >= 30) {
            return "EAST";
        } else {
            return "Ups ;(";
        }
    }
}
