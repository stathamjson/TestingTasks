public class ChangeValuesThrouthThirdVariable {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(changeValues(a,b));
    }

    private static String changeValues(int a, int b) {
        String str = "входящие значения " + a + " и " + b;
        int c = 0;
        c=a;
        a=b;
        b=c;
        return (str + " , а новые значения " + a + " и " + b  );

    }
}
