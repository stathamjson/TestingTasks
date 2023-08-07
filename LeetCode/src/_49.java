import java.util.*;

class _49 {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution49 solution49 = new Solution49();
        System.out.println(solution49.groupAnagrams(strs));

    }
}

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList());
            }
            map.get(sorted).add(s);
        }

        return new ArrayList(map.values());

    }
}