package homework.day3.cycletask;

import java.util.Random;

public class ArrayIntRandom {

    public void arrayNumbersRandom() {

        Random random = new Random();
        int[] nums = new int[7];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(7);
            System.out.println(nums[i]);
        }
    }
}