import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        String h = "baddad";
        String n = "add";
        int x = -1234567890;
        Solution1 solution = new Solution1();

        long start = System.nanoTime();
        System.out.println(solution.reverse(x));
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        start = System.nanoTime();
        System.out.println(solution.reverseStream(x));
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        System.out.println(solution.reverseStream(-1235));
        System.out.println(solution.reverseStream(-125465485));

    }
}

class Solution1 {
    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }
        long reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        if (reversed > Integer.MAX_VALUE) {
            return 0;
        }

        return negative ? (int) (-1 * reversed) : (int) reversed;
    }

    public int reverseStream(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }
        String xStr = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder();

       char [] xChar = xStr.toCharArray();
       String[] strArray = new String[xChar.length];

       for (int i=0;i<xChar.length;i++) {
           strArray[strArray.length-1-i] = Character.toString(xChar[i]);
       }
        Arrays.stream(strArray)
                .forEach((e) -> stringBuilder.insert(stringBuilder.length(), e));
        String resultStr = new String(stringBuilder);
        long result = Long.parseLong(resultStr);

        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        return negative ? (int) (-1 * result) : (int) result;
    }
//    public static IntStream reverseOrderStream(IntStream intStream) {
//        int[] tempArray = intStream.toArray();
//        return IntStream.range(1, tempArray.length + 1).boxed()
//                .mapToInt(i -> tempArray[tempArray.length - i]);
//    }
//
//    static IntStream revRange(int from, int to) {
//        return IntStream.range(from, to)
//                .map(i -> to - i + from - 1);
//    }
}

// может быть через стрим развернуть ? а не через цикл?