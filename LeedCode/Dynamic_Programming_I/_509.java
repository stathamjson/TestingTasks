package LeedCode.Dynamic_Programming_I;

public class _509 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
        System.out.println(fib1(n));

    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib1(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 2; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }

}
