package code.LeedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * <p>
 * Example 2:
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class _704 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 6, 7, 9, 10};
        int[] nums2 = new int[]{5};
        int target = 6;




            System.out.println(search(nums2, 5));

    }

    private static int search(int[] nums, int target) {
        int t = -1;
        int from = 0;
        int to = nums.length - 1;
        int mid, midVal;

        while (from <= to) {
            mid = (from + to) >>> 1;
            midVal = nums[mid];

            if (target > midVal) {
                from = mid + 1;
            } else if (target < midVal) {
                to = mid-1;
            } else {
                return mid;
            }
        }
        return t;
    }
}
