package code.LeedCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * *
 * Example 1:
 * * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Example 2:
 * * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class _121 {
    public static void main(String[] args) {

        int[] nums0 = new int[]{7, 1, 5, 3, 6, 4}; //5
        int[] nums1 = new int[]{9, 6, 5, 4, 4, 4, 2, 1, 0}; //0
        int[] nums2 = new int[]{0};//0
        int[] nums3 = new int[]{9, 8, 2, 5, 3, 6, 4, 1, 8, 9, 1}; //8

        List<int[]> list = new ArrayList<>();
        list.add(nums0);
        list.add(nums1);
        list.add(nums2);
        list.add(nums3);


        for (int[] element :
                list) {
            System.out.println(maxProfit(element));
        }

        long startTime = System.nanoTime();
        System.out.println(maxProfit(nums0));
        long endTime = System.nanoTime();
        long duration = TimeUnit.MICROSECONDS.toMillis(endTime - startTime);
        System.out.println("Время выполнения метода " + duration + " мс");

         startTime = System.nanoTime();
        System.out.println(maxProfit1(nums0));
         endTime = System.nanoTime();
         duration = TimeUnit.MICROSECONDS.toMillis(endTime - startTime);
        System.out.println("Время выполнения метода " + duration + " мс");

    }

    private static int maxProfit(int[] nums) {

        int left = 0;
        int right = 1;
        int max = 0;

        while (right<nums.length) {
            if (nums[left] < nums[right]) {
                int diff = nums[right] - nums[left];
                max = Math.max(diff, max);
                right++;
            } else {
                left=right;
                right++;
            }
        }
        return max;
    }

    public static int maxProfit1(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

}
