package task5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4, 5};
        Solution solution = new Solution();

        long start = System.currentTimeMillis();
        System.out.println(solution.findMedianSortedArrays(num1, num2));
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        start = System.currentTimeMillis();
        System.out.println(solution.findMedianSortedArraysAlt(num1, num2));
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = concatAndSort(nums1, nums2);
        int middle = (arr.length) / 2;
        double median;
        if (arr.length % 2 == 0) {
            median = (arr[middle] + arr[middle - 1]) / 2d;
        } else {
            median = arr[middle];
        }
        return median;
    }

    public double findMedianSortedArraysAlt(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int lo = 0;
        int hi = nums1.length;
        int combinedLength = nums1.length + nums2.length;

        while (lo <= hi) {
            int partX = (lo + hi) / 2;
            int partY = (combinedLength + 1) / 2 - partX;

            int leftX = getMax(nums1, partX);
            int rightX = getMin(nums1, partX);

            int leftY = getMax(nums2, partY);
            int rightY = getMin(nums2, partY);

            if (leftX <= rightY && leftY <= rightX) {
                if (combinedLength % 2 == 0) {
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY)) / 2.0;
                }
                return Math.max(leftX, leftY);
            }
            if (leftX > rightY) {
                hi = partX - 1;
            } else {
                lo = partX + 1;
            }
        }
        return -1;
    }

    int getMax(int[] nums, int partition) {
        if (partition == 0) {
            return (int) Double.NEGATIVE_INFINITY;
        } else {
            return nums[partition - 1];
        }
    }

    int getMin(int[] nums, int partition) {
        if (partition == nums.length) {
            return (int) Double.POSITIVE_INFINITY;
        } else {
            return nums[partition];
        }
    }

    int[] concatAndSort(int[] arr1, int[] arr2) {
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;
        int[] arr3 = new int[arr1_len + arr2_len];
        System.arraycopy(arr1, 0, arr3, 0, arr1_len);
        System.arraycopy(arr2, 0, arr3, arr1_len, arr2_len);
        Arrays.sort(arr3);
        return arr3;
    }

}





