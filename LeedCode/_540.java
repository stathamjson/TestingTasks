package code.LeedCode;

import java.util.Arrays;

public class _540 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5};
        int[] nums1 = new int[]{3};
        int[] nums2 = new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};


        System.out.println(singleNonDuplicate(nums1));
        System.out.println(singleNonDuplicate2(nums1));
        System.out.println(singleNonDuplicate3(nums1));
    }

    private static int singleNonDuplicate(int[] nums) {
        int pos = 0;
        int low = 0;
        int high = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[high] != nums[high - 1]) {
            return nums[high];
        }
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if ((nums[mid] != nums[mid - 1]) && (nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            if (((mid & 1) != 0 && (nums[mid] == nums[mid - 1]))
                    || ((mid & 1) == 0 && (nums[mid] == nums[mid + 1]))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    private static int singleNonDuplicate2(int[] nums) {
        return Arrays.stream(nums).reduce((x, y) -> x ^ y).orElse(0);
    }

    private static int singleNonDuplicate3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        return sum;
    }
}
