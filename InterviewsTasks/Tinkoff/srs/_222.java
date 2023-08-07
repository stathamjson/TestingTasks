import java.util.Scanner;

public class _222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculateSlices(n));
    }

    private static int calculateSlices(int n) {
        int rest=n;
        int i = 0;
                while (rest >= 2) {
            rest = rest/2;
            i++;
        }
        int ost = (int) (n - Math.pow(2,i)) > 0? 1 : 0;
        return i+ost;
    }
}
