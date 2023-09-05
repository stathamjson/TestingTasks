package LeedCode.Data_Structure_I;

public class _74_Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target = 13;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        // ищем ряд
        int low = 0;
        int high = matrix.length - 1;
        int row = 0;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midValFirstInRow = matrix[mid][0];
            int midValLastInRow = matrix[mid][matrix[0].length-1];

            if (target < midValFirstInRow) {
                high = mid - 1;
            } else if (target > midValLastInRow) {
                low = mid + 1;
            }
            else {
                row = mid;
                break;
            }
        }

        low = 0;
        high = matrix[row].length-1;
        int column = Integer.MIN_VALUE;

        while (low <= high) {
            int mid = (low+high)>>>1;
            int midVal = matrix[row][mid];

            if (midVal < target) {
                low=mid+1;

            } else if (midVal > target) {
                high=mid-1;
            }
            else {
                column=mid;
                break;
            }
        }

        return column>Integer.MIN_VALUE? true: false;
    }

}
