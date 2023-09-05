package Algorithms_I;

import java.util.*;

public class _167_dif {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6};
        int k = 3;
        System.out.println(Arrays.toString(arr));

        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int[] nums, int k) {

        k = k % nums.length;
        if (k < 0) {
            k = k + nums.length;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k , nums.length - 1);
        reverse(nums, 0, nums.length - 1);


    }

    public static void reverse(int[] arr, int i, int j) {

        int li = i;
        int ri = j;
        int temp = 0;

        while (li < ri) {
            temp = arr[ri];
            arr[ri] = arr[li];
            arr[li] = temp;
            li++;
            ri--;
        }

    }


    public static void rotateII(int[] nums, int k) {

        if (k != 0) {

            k = k % nums.length;
            int temp = 0;
            for (int j = 0; j < k; j++) {
                temp = nums[nums.length - 1];
                for (int i = nums.length - 2; i >= 0; i--) {
                    nums[i + 1] = nums[i];
                }
                nums[0] = temp;
            }
        }
    }
}
