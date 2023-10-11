package homework.day3.cycletask;

import java.util.Random;

public class ArrayIntSquare {
    public void arrayNumbersSquare() {

        Random random = new Random();
        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(7);
            nums[i] = nums[i] * nums[i];
            System.out.println(nums[i]);

        }
    }
}

