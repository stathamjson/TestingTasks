package code.LeedCode;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * <p>
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * <p>
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 * <p>
 * Constraints:
 * * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */
public class _11 {

    public static void main(String[] args) {

        int[] input = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] input1 = new int[]{2, 3, 4, 5, 18, 17, 6};
        System.out.println(maxArea(input));
    }

    private static int maxArea(int[] height) {
        int maxHeight = 0;
        int i = 0;
        int first = height[i];
        int indexFirst = i;
        int last = height[height.length - 1];
        int indexLast = height.length - 1;
        while (i < height.length - 1) {
            int tempHeight = first > last ? last : first;
            int temp = tempHeight * (indexLast - indexFirst);
            if (temp > maxHeight) {
                maxHeight = temp;
            }
            if (last >= first) {
                ++indexFirst;
                first = height[indexFirst];

            } else {
                --indexLast;
                last = height[indexLast];
            }
            ;
            ++i;
        }
        return maxHeight;
    }

    /**
     * этот вариант не прошел по времени в LeetCode
     *
     * @param height
     * @return
     */
    private static int maxArea1(int[] height) {
        // TODO document why this method is empty
        int maxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int tempHeight = height[i] > height[j] ? height[j] : height[i];
                int temp = tempHeight * (j - i);
                if (temp > maxHeight) {
                    maxHeight = temp;
                }
            }
        }
        return maxHeight;
    }
}
