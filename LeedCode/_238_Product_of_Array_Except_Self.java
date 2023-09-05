package LeedCode;

import java.util.*;

public class _238_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int countNulls = 0;
        int firstNullIndex = 0;
        int product = 1;

        for (int i = 0; i <nums.length; i++) {
            if (nums[i] == 0) {
                firstNullIndex = i;//usefull if null only one
                countNulls++;
            } else {
                product *= nums[i];
            }
        }

        if (countNulls > 1) {
            Arrays.fill(res, 0);
            return res;
        } else if (countNulls == 1) {
            Arrays.fill(res, 0);
            res[firstNullIndex] = product;
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = product / nums[i];
        }
        return res;
    }
}
