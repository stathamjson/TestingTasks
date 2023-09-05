package code.LeedCode;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class _1 {
    public static void main(String[] args) {
        int[] input = new int[]{3, 5, 6, 7};
        int target = 10;

        System.out.println(Arrays.toString(twoSums(input, target)));
        System.out.println(Arrays.toString(twoNumberSum(input, target)));

    }

    private static int[] twoSums(int[] input, int target) {
        int[] result = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(target - input[i])) {
                return new int[]{map.get(target - input[i]), i};
            } else {
                map.put(input[i], i);
            }

        }
        return new int[]{-1, -1};
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Map<Integer,Integer> res = new HashMap<>();

        for (int i = 0; i< array.length; i++) {
            if (res.containsKey(targetSum-array[i])) {
                return new int []{array[i],targetSum-array[i]};
            }
            else {
                res.put(array[i],targetSum-array[i]);
            }
        }

        // Write your code here.
        return new int[0];
    }
}
