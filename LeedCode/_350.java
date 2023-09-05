package code.LeedCode;

import java.util.*;

public class _350 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{2, 4};

        System.out.println(Arrays.toString(intersect(arr2, arr1)));
    }
//todo можно решить с двумя указателями - это эффективнее. через сортировку. подумать надо.
    private static int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i <nums1.length; i++) {
            map.merge(nums1[i],1,Integer::sum );
        }

        for (int i = 0; i < nums2.length; i++) {

            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                ans.add(nums2[i]);
            }
        }

       return  ans.stream()
               .mapToInt(Integer::intValue)
               .toArray();
    }
}
