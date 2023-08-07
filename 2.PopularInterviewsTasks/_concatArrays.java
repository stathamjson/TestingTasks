import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * методы объединения массивов и сортировки
 */

public class _concatArrays {
    public static void main(String[] args) {
        Integer[] mas1 = {1, 4, 9};
        Integer[] mas2 = {2, 3, 7, 8};
        int[] ma1 = {1, 4, 9};
        int[] ma2 = {2, 3, 7, 8};
        int[] ma3 = {2, 3, 7, 8};

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};

        Integer[] newAr = concatGeneticArraysAndSort(mas1, mas2);

        for (int i = 0; i < newAr.length; i++) {
            System.out.print(newAr[i] + " ");
        }

    }

    static int[] joinArraysAndSort(int[] m1, int[] m2) {
        int[] newArray = new int[m1.length + m2.length];
        for (int i = 0; i < m1.length; i++) {
            newArray[i] = m1[i];
        }
        for (int j = 0; j < m2.length; j++) {
            newArray[m1.length + j] = m2[j];
        }
        Arrays.sort(newArray);
        return newArray;
    }

    static int[] concatIntArraysAndSort(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }
        int[] result = new int[length];
        int position = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, result, position, array.length);
            position += array.length;
        }
        Arrays.sort(result);
        return result;
    }

    static <T> T[] concatGeneticArraysAndSort(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }
        T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
        var offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        Arrays.sort(result);
        return result;
    }


    static String[] concatStringArrays(String[] s1, String[] s2, String[] s3) {
        String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);

        return result;
    }

}
