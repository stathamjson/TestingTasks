package LeedCode.Dynamic_Programming_I;

public class _152_Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] nums = {-2};

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;
        int leftProduct = 1;
        int rightProduct = 1;
        int max = 0;

        while (left < nums.length && right >= 0) {

            leftProduct = leftProduct * nums[left];

            rightProduct = rightProduct * nums[right];

            max = Math.max(Math.max(rightProduct, leftProduct), max);

            if (nums[left] == 0) {
                leftProduct=1;
            }
            if (nums[right] == 0) {
                rightProduct=1;
            }
            left++;
            right--;

        }
        return max;

    }
}
