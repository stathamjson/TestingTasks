package code.LeedCode;

import java.util.HashSet;
import java.util.Set;

public class _202 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(isHappy(num));


    }

    static boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> results = new HashSet<>();

         while (true) {
             while (n > 0) {
                 sum = sum + (n % 10) *(n%10);
                 n = n / 10;
             }
             if (results.contains(sum)) {
                 return false;
             }
             results.add(sum);
             if (sum == 1) {
                 return true;
             }
             n=sum;
             sum=0;
         }

    }


}
