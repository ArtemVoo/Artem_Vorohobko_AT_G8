package cycletask;

import java.util.Random;

public class ArrayIntMultFive {

    public void arrayNumbersMultFive(){

        Random random = new Random();
        int[] nums = new int[7];

        for(int i : nums) {
            nums[i] = random.nextInt(7);
            System.out.println(nums[i]*5);
        }
    }
}
