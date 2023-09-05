package Algorithms_I;

import java.util.*;

/**Squares of a Sorted Array*/
public class _977 {
    public static void main(String[] args) {

        int[] arr = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(arr)));
        System.out.println(Arrays.toString(sortedSquares1(arr)));
    }

    public static int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];

        }

        Arrays.sort(arr);
        return arr;
    }

    public static int[] sortedSquares1(int[] array) {

        int[] arr = new int[array.length];
        int left = 0;
        int right = array.length-1;

        for (int i = array.length - 1; i >= 0; i--) {

            if (Math.abs(array[left]) > Math.abs(array[right])) {
                arr[i] = array[left] * array[left];
                left++;
            }
            else {
                arr[i] = array[right] * array[right];
                right--;
            }
        }
        return arr;
    }
}

