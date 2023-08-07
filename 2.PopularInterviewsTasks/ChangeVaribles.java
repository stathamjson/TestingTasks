public class ChangeVaribles {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(changeValues(a,b));
    }

    private static String changeValues(int a, int b) {
        String str = "входящие значения " + a + " и " + b;

        a=a+b;
        b=a-b;
        a=a-b;
        return (str + " , а новые значения " + a + " и " + b  );

    }
}
