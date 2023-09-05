package code.LeedCode;

public class _35 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert(input, target));


    }

    private static int searchInsert(int[] nums, int target) {
        int result = 0;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                result = mid;
                break;
            }
        }
        if (result == 0) {
            result = low;
        }

        return result;
    }
}
