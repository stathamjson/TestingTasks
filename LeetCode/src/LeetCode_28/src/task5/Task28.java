package task5;

public class Task28 {
    public static void main(String[] args) {
        String h = "baddad";
        String n = "add";
        Solution28 solution = new Solution28();

        long start = System.currentTimeMillis();
        System.out.println(solution.strStr(h, n));
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}

class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}