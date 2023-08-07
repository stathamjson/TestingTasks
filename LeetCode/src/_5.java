import java.util.*;

public class _5 {
    public static void main(String[] args) {
        int[] twoSum = new int[]{ 2, 8, 1, 11, 15};
        int target = 9;
        int[] after = solution.twoSum(twoSum, target);
        for (int i = 0; i < after.length; i++) {
            System.out.print(after[i] + " ");
        }
    }

    static class solution {
        static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> num_map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (num_map.containsKey(target - nums[i])) {
                    return new int[]{num_map.get(target - nums[i]), i};
                }
                num_map.put(nums[i], i);
            }
            throw new IllegalArgumentException("now match found!");
        }

    }


}


