package code.LeedCode;


public class _374 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(quessnumber(n));

    }

    private static int quessnumber(int n) {
        int low = 1;
        int hi = n;

        while (low <= hi) {
            int mid = (low+hi)>>>1;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                hi= mid - 1;
            } else {
                low = mid+1;
            }

        }
return -1;

    }

    private static int guess(int mid) {
        return 0;
    }

}
