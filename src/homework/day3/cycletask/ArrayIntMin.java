package homework.day3.cycletask;

import java.util.Random;

public class ArrayIntMin {
    public void arrayNumbersMin() {
        int[] nums = new int[7];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(7);
            System.out.print(nums[i] + " ");
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println();
        System.out.println("Min is: " + min);
    }
}
