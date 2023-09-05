package LeedCode;

import java.util.*;

public class _75_Sort_Colors {

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 2, 0, 2, 0};

        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int middle = 0, start = 0;
        int end = nums.length - 1;
        int swap;

        while (middle <= end) {

            if (nums[middle] == 1) {
                middle++;
            } else if (nums[middle] == 2) {
                swap = nums[middle];
                nums[middle] = nums[end];
                nums[end] = swap;
                end--;

            } else {
                swap = nums[middle];
                nums[middle] = nums[start];
                nums[start] = swap;
                start++;
                middle++;
            }
        }
    }
}
