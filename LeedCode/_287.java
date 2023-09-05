package code.LeedCode;

public class _287 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,3,4,2};
        System.out.println(findDuplicate(nums));

    }

    private static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (nums[fast] != nums[slow]) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return nums[slow];
    }
}
