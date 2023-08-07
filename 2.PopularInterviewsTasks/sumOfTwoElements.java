import java.util.HashSet;
import java.util.Set;

/**
 * данн отсортированный массив и число К.
 * нужно вернуть два числа, сумма которых равна К
 */

public class sumOfTwoElements {
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1, 3, 5};
        int k = 4;
        sumOfTwoElements sum = new sumOfTwoElements();
        int[] res = sum.twoSum(nums, k);
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println("\n=======finish======\n");
        int[] res1 = sum.twoSumSet(nums, k);
        for (int i : res1) {
            System.out.print(i + " ");
        }
        int[] res2 = sum.twoSumBinarySearch(nums, k);
        int[] res3 = sum.twoSumPointers(nums, k);


    }

    int[] twoSumPointers(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int l = 0, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == k) {
                    return new int[]{nums[l], nums[r]};
                }
                if (sum < k) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new int[0];

    }

    int[] twoSumBinarySearch(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] == numberToFind) {
                    return new int[]{nums[i], nums[mid]};
                }
                if (numberToFind < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[0];
    }

    int[] twoSumSet(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int numberToFind = k - nums[i];
            if (set.contains(numberToFind)) {
                return new int[]{numberToFind, nums[i]};
            }
            set.add(nums[i]);
        }
        return new int[0];
    }

    int[] twoSum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[0];
    }


}
