import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        System.out.println(generateNumbers(l, r));
    }

    private static int generateNumbers(long l, long r) {
        long generated;
        List<Long> list = new ArrayList<>();
        while (l <= r) {
            generated = sameDigits(l);
            if (generated >= l && generated <= r) {
                list.add(generated);
            }
            l = (long) (l + Math.pow(10, (findTens(l))));

        }
        return list.size();
    }

    private static long findFirstDigit(long l) {
        int i = (int) findTens(l);
        return (long) (l / (Math.pow(10, i)));

    }

    // ищем разрядность числа
    private static long findTens(long l) {
        int i = 0;
        while (l / 10 > 0) {
            l = l / 10;
            i++;
        }
        return i;
    }

    // создаем число из одинаковых цифр и возвращаем его
    private static long sameDigits(long d) {
        long result = 0;
        int firstDigit = (int) findFirstDigit(d);
        int tens = (int) findTens(d);

        for (int j = 0; j <= tens; j++) {
            result = (long) (result + firstDigit * (Math.pow(10, j)));
        }

        return result;
    }
}
