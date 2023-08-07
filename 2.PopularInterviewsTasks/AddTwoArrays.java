 class AddTwoArrays {
    public static void main(String[] args) {
        int[] num1 = new int[]{ 1, 1, 1};
        int[] num2 = new int[]{9, 0, 9};
        Solution solution = new Solution();
        solution.sumTwoArrays(num1, num2);
    }
}

class Solution {
    int[] sumTwoArrays(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int lengthOfSum = l1 > l2 ? l1 : l2;
        int[] sumNums = new int[lengthOfSum];
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
            int[] sumNumsNew = new int[sumNums.length + 1];
            System.arraycopy(sumNums, 0, sumNumsNew, 1, sumNums.length);
            sumNumsNew[0] = additionalDigit;
            sumNums = sumNumsNew;
        }
        for (int i : sumNums
        ) {
            System.out.print(i + " ");
        }
        return sumNums;
    }
}
