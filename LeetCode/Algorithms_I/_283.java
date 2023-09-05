package Algorithms_I;

import java.util.*;

public class _283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        System.out.println(Arrays.toString(arr));

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void moveZeroes(int[] nums) {

        int notNull = 0;

        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] != 0) {
                nums[notNull] = nums[i];
                notNull++;
            }
        }

        for (int j = notNull; j <= nums.length - 1; j++) {
            nums[j] = 0;
        }

    }


    static void moveZeroes2(int[] nums) {

        if (nums.length > 1) {

            int leftIndex = 0;
            int rightIndex = leftIndex + 1;
            int temp = 0;

            while (rightIndex < nums.length) {

                if (nums[leftIndex] == 0) {

                    while (nums[rightIndex] == 0 && rightIndex<nums.length-1) {
                        rightIndex++;
                    }

                    temp = nums[leftIndex];
                    nums[leftIndex] = nums[rightIndex];
                    nums[rightIndex] = temp;


                }
                rightIndex++;
                leftIndex++;

            }
        }
    }

    static void moveZeroes1(int[] nums) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int temp = 0;

        while (leftIndex < rightIndex) {

            if (nums[leftIndex] == 0) {

                while (nums[rightIndex] == 0) {
                    rightIndex--;
                }

                temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;
                rightIndex--;
            }
            leftIndex++;

        }
    }


}
