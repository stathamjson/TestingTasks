package code.LeedCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums, find the subarray
 *  with the largest sum, and return its sum.
 *
 *Example 1:
 *Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 *
 *Example 2:
 *Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 *
 *Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class _53 {
    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();

        int[] nums0 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{5,4,-1,7,8};
        int[] nums3 = new int[]{-2,-3,4,-1,-2,1,5,-3};
        list.add(nums0);
        list.add(nums1);
        list.add(nums2);
        list.add(nums3);

        for (int[] element :
                list) {
            System.out.println(maxSubArray(element));
        }



    }

    private static int maxSubArray(int[] nums) {
        int maxRes = Integer.MIN_VALUE;
        int currentMax = 0;
        int i = 0;

        while (i < nums.length) {
            currentMax = currentMax + nums[i];

            if (currentMax < nums[i]) {
                currentMax = nums[i];
            }
            if (maxRes < currentMax) {
                maxRes=currentMax;
            }
            i++;
        }

        return maxRes;
    }
}
