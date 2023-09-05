package code.LeedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <p>
 * Example 1:
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation:
 * The pivot index is 3.
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 * <p>
 * Example 2:
 * Input: nums = [1,2,3]
 * Output: -1
 * Explanation:
 * There is no index that satisfies the conditions in the problem statement.
 * <p>
 * Example 3:
 * Input: nums = [2,1,-1]
 * Output: 0
 * Explanation:
 * The pivot index is 0.
 * Left sum = 0 (no elements to the left of index 0)
 * Right sum = nums[1] + nums[2] = 1 + -1 = 0
 */
public class _724 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] nums2 = new int[]{2, 1, -1};
        int[] nums3 = new int[]{1, 7, 3, 6, 5, 6};

        List<int[]> list = new ArrayList<int[]>();
        list.add(nums1);
        list.add(nums2);
        list.add(nums3);

        for (int[] element :
                list) {
            System.out.println(pivotIndex(element));
        }
    }

    private static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum - nums[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }

        return -1;
    }


}
