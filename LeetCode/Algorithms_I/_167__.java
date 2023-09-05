package Algorithms_I;

import java.util.*;

public class _167__ {
    public static void main(String[] args) {

        int[] input = new int[]{3, 5, 6, 7};
        int target = 10;

        System.out.println(Arrays.toString(twoSum(input, target)));
        System.out.println(Arrays.toString(twoSumEff(input, target)));

    }

    public static int[] twoSumEff(int[] numbers, int target) {

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        while (numbers[leftIndex] + numbers[rightIndex] != target) {

            if (numbers[leftIndex] + numbers[rightIndex] < target) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return new int[]{leftIndex + 1, rightIndex + 1};

    }

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            }
            map.put(numbers[i], i);

        }

        return new int[]{-1, -1};
    }
}
