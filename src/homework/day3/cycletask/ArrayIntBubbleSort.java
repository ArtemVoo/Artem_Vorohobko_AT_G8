package homework.day3.cycletask;

import java.util.Random;

public class ArrayIntBubbleSort {
    public void arrayNumbersBubbleSort() {
        int[] nums = new int[7];
        Random random = new Random();

        for (int i = 1; i < nums.length; i++) {
            nums[i] = random.nextInt(7);
            System.out.println(nums[i]);
        }
        System.out.println("------------");

        int x;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    x = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = x;
                    isSorted = false;
                }
                System.out.println(nums[i]);
            }
        }
    }
}

