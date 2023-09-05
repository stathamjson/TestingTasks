package code.LeedCode;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively. *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order. *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * <p>
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * <p>
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class _88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums3 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums3, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge1(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            System.out.println(Arrays.toString(nums2));

        } else {
            int iM = m - 1;
            int iN = n - 1;

            while (iM >= 0 && iN >= 0) {
                if (nums1[iM] > nums2[iN]) {
                    nums1[iM + iN + 1] = nums1[iM];
                    if (iM > 0) {
                        iM--;
                    } else break;
                } else {
                    nums1[iM + iN + 1] = nums2[iN];
                    if (iN > 0) {
                        iN--;
                    } else break;
                }
            }
            System.out.println(Arrays.toString(nums1));
        }

    }

}
