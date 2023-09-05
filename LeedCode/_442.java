package code.LeedCode;

import java.util.*;

public class _442 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 3, 5,4,6,7};
        System.out.println(Arrays.toString(findDuplicates1(nums)));
    }
    //todo сделать вариант с доп памятью О(1)

    private static int[] findDuplicates1(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int abc = Math.abs(nums[i])-1;
            if (nums[abc] > 0) {
                nums[abc] = -nums[abc];
            } else {
                list.add(Math.abs(nums[i]));
                nums[abc] = -nums[abc];
            }
        }
        return list.stream()
                .mapToInt(e-> Integer.valueOf(e))
                .toArray();
    }


    private static int[] findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);

            }else {
                res.add(nums[i]);
            }
        }
        return res.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }


}
