package LeedCode.Data_Structure_I;

import java.util.*;

public class _240_Search_a_2D_Matrix_II {
    public static void main(String[] args) {

        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        System.out.println(searchMatrix(matrix,target));

        int [][] matrix1 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target1 = 20;

        System.out.println(searchMatrix(matrix1,target1));

        int[][] matrix2 = {{-5}};
        int target2 = -5;
        System.out.println(searchMatrix(matrix2, target2));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {

            int midValFirstInRow = matrix[i][0];
            int midValLastInRow = matrix[i][matrix[0].length - 1];

            if (target >= midValFirstInRow && target <= midValLastInRow) {

                int low = 0;
                int high = matrix[i].length - 1;
                int result = Integer.MIN_VALUE;

                while (low <= high) {

                    int mid = (low + high) >>> 1;
                    int midVal = matrix[i][mid];

                    if (midVal < target) {
                        low = mid + 1;
                    } else if (midVal > target) {
                        high = mid - 1;
                    } else if (midVal == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean searchMatrix1(int[][] matrix, int target) {

        return false;

    }
}
