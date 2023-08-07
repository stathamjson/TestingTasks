import java.util.stream.IntStream;

public class palindromChecker {

    public static void main(String[] args) {
        String s1 = "maDam";
        String s2 = "raceCar";
        String s3 = "aBba";
        String s4 = "swims";
        String s5 = "wifI";
    }

    public static boolean palindromCheckerTraditional(String string) {
        String normalized = string.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed.append(normalized.charAt(i));
        }

        return normalized.equals(reversed.toString());
    }

    public static boolean palindromCheckerModern(String string) {
        String normalized = string.toLowerCase();

        return IntStream.range(0, normalized.length() / 2)
                .allMatch(e ->
                        string.charAt(e) ==
                                string.charAt(normalized.length() - e - 1));

    }
}
