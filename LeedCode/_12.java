package code.LeedCode;



import java.util.*;

public class _12 {
    public static void main(String[] args) {
        int input = 1234;

        System.out.println(intToRoman(input));

    }

    private static String intToRoman(int num) {
        ArrayList integers = new ArrayList(Arrays.asList(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000));
        ArrayList romans = new ArrayList(Arrays.asList("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"));
        String res = "";
        for (int i = integers.size()-1; i >=0; i--) {

        while (num / (int)integers.get(i) > 0) {
            int n = num / (int)integers.get(i);
            String nres = "";
            for (int j = 0; j < n; j++) {
                nres = nres + romans.get(i);

            }
            res = res + nres;
            num = num%(int)integers.get(i);
        }
    }
        return res;
    }
}



