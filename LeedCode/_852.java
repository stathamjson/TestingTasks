package code.LeedCode;

public class _852 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 10, 8, 5, 0};

        System.out.println(peakIndexInMountainArray(nums));

    }

    private static int peakIndexInMountainArray(int[] arr) {

        int low = 1;
        int hi = arr.length - 2;

        while (low <= hi) {

            int mid = (low + hi) >>> 1;
            int midVal = arr[mid];

            if (midVal > arr[mid - 1] && midVal < arr[mid + 1]) {
                low = mid + 1;
            } else if (midVal < arr[mid - 1] && midVal > arr[mid + 1]) {
                hi=mid-1;
            } else {
                return mid;}

        }
        return -1;
    }
}
