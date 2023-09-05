package LeedCode.Dynamic_Programming_I;

import java.util.*;

public class _213_House_Robber_II {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
        System.out.println(robEf(nums));

    }

    public static int robEf(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int [] skipFirstHouse = new int[nums.length - 1];
        int[] skipLastHouse = new int[nums.length - 1];

        for (int i = 0; i < nums.length-1; i++) {
            skipFirstHouse[i]=nums[i];
            skipLastHouse[i]=nums[i+1];
        }

        int maxSkipFirstHouse = robHelper(skipFirstHouse);
        int maxSkipLastHouse = robHelper(skipLastHouse);

        return Math.max(maxSkipFirstHouse, maxSkipLastHouse);


    }

     static int robHelper(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int []  result = new int[arr.length];
        result[0] =arr[0];
        result[1]=Math.max(arr[1],arr[0]);

        for (int i = 2; i < arr.length; i++) {

            result[i] = Math.max(arr[i] + result[i - 2], result[i - 1]);
        }
        return  Arrays.stream(result)
                .max().getAsInt();
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] resultFromBeginning = new int[nums.length - 1];
        resultFromBeginning[0] = nums[0];
        resultFromBeginning[1] = Math.max(nums[0], nums[1]);

        int[] resultFromEnd = new int[nums.length - 1];
        resultFromEnd[resultFromEnd.length - 1] = nums[nums.length - 1];
        resultFromEnd[resultFromEnd.length - 2] = Math.max(nums[nums.length - 2], nums[nums.length - 1]);


        for (int i = 2; i < nums.length-1; i++) {

            resultFromBeginning[i] = Math.max(nums[i] + resultFromBeginning[i - 2], resultFromBeginning[i - 1]);
            resultFromEnd[resultFromEnd.length-1-i] = Math.max(nums[nums.length-1-i] + resultFromEnd[resultFromEnd.length-1-i+2],resultFromEnd[resultFromEnd.length-1-i+1]);
        }

        return Math.max(Arrays.stream(resultFromBeginning).max().getAsInt(), Arrays.stream(resultFromEnd).max().getAsInt());

    }
}
