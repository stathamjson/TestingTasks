import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class GeneratorUniqueRandom {
    public static void main(String[] args) {
        int min = 0, max = 20, n = 10;
        Arrays.stream(GenerateUniqueRandomArray(n, min, max)).sorted().forEach(e -> System.out.println(e));
    }

    private static int[] GenerateUniqueRandomArray(int n, int min, int max)  {
        if (n > max - min) {
            System.out.println("Диапазон для генерации меньше размера требуемого массива. Невозможно сгенерировать уникальные значения");
            return new int[0];
        }


        int[] array = new int[n];
        Set set = new HashSet();
        int temp = 0, i = 0;
        while (i <= n - 1) {
            temp = (int) (Math.random() * (max - min)) + min;
            if (!set.contains(temp)) {
                array[i] = temp;
                set.add(temp);
                i++;
            }
        }
        return array;
    }


}
