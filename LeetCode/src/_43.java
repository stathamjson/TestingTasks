import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class _43 {
    public static void main(String[] args) {
        String num1 = "2",
                num2 = "3";
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.multiply(num1, num2));
    }

}

class Solution43 {
    public String multiply(String num1, String num2) {
        return fromArrayToString(sumTwoArrays(num1,num2));
    }


    Integer[] fromStringToList(String input) {
        Integer[] num = Arrays.asList(input.split("")).stream()
                .map(e -> Integer.parseInt(e))
                .toArray(Integer[]::new);
        return num;
    }

    String fromArrayToString(Integer[] input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            stringBuilder.append(input[i]);
        }
        return stringBuilder.toString();
    }

    /**
     * неправильно сделал перемножение массива
     */
    Integer[] sumTwoArrays(String num1, String num2) {
        Integer[] arr1 = fromStringToList(num1);
        Integer[] arr2 = fromStringToList(num2);

        int l1 = arr1.length;
        int l2 = arr2.length;
        int lengthOfSum = l1 > l2 ? l1 : l2;
        Integer[] sumNums = new Integer[lengthOfSum];
        int sumOfDigits = 0;
        int additionalDigit = 0;

        while (lengthOfSum > 0) {
            sumOfDigits = additionalDigit;
            sumOfDigits += l1 > 0 ? arr1[--l1] : 0;
            sumOfDigits += l2 > 0 ? arr2[--l2] : 0;
            sumNums[lengthOfSum - 1] = sumOfDigits % 10;
            additionalDigit = sumOfDigits / 10;
            lengthOfSum--;
        }
        if (additionalDigit > 0) {
            Integer[] sumNumsNew = new Integer[sumNums.length + 1];
            System.arraycopy(sumNums, 0, sumNumsNew, 1, sumNums.length);
            sumNumsNew[0] = additionalDigit;
            sumNums = sumNumsNew;
        }
        return sumNums;
    }


    BigDecimal fromCharArrayToInt(String input) {
        char[] chars = input.toCharArray();
        List list = Arrays.asList(input.split(""));
        BigDecimal result = BigDecimal.valueOf(0);
        for (int i = 0; i < list.size(); i++) {
            result = result
                    .multiply(BigDecimal.valueOf(10))
                    .add(BigDecimal.valueOf(Integer.parseInt((String) list.get(i))));
        }


        return result;
    }

    Long fromStringToLong(String input) {
        char[] chars = input.toCharArray();
        List list = Arrays.asList(input.split(""));
        Long result = 0L;
        for (int i = 0; i < list.size(); i++) {
            result = result
                    * 10
                    + (Long.parseLong((String) list.get(i)));
        }


        return result;
    }

}