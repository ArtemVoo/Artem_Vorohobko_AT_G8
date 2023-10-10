package cycletask;

import java.util.Random;

public class ArrayIntReverse {

    public void arrayNumbersReverse() {
        Random random = new Random();
        int[] nums = new int[7];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(7);
            System.out.println(nums[i]);
        }
        System.out.println("-----------------");

        for (int i = 0; i < nums.length / 2; i++) {
            int x = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = x;
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}

