import static org.junit.Assert.assertEquals;

public class reverseNumber {
    public static void main(String[] args) {
        int input = 1234567901;

        System.out.println("введенное число = " + input + ", перевертыш = " + reverseNum(input));
        //assertEquals(reverseNum(input), 1097654321);

        System.out.println("введенное число = " + input + ", перевертыш = " + reverseNumByString(input));
    }

    static int reverseNum(int input) {
        int reverse = 0, ost = 0;

        while (input > 0) {
            ost = input % 10;
            reverse *= 10;
            reverse += ost;
            input = input / 10;
        }
        return reverse;
    }
    static int reverseNumByString (int input) {

        String temp = new StringBuilder(String.valueOf(input))
                .reverse()
                .toString();

        return Integer.parseInt(temp);

    }

}
