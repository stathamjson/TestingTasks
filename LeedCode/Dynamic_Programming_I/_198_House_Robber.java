package LeedCode.Dynamic_Programming_I;

import java.util.*;

public class _198_House_Robber {
    public static void main(String[] args) {

        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int []  result = new int[nums.length];
        result[0] =nums[0];
        result[1]=Math.max(nums[1],nums[0]);

        for (int i = 2; i < nums.length; i++) {

            result[i] = Math.max(nums[i] + result[i - 2], result[i - 1]);
        }
       return  Arrays.stream(result)
                .max().getAsInt();
    }
}
