import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AversString {

    public static void main(String[] args) {
        String str = "Hello, my friend!";
        System.out.println(reverseString(str));
        System.out.println(reverseStringByCharArray(str));
    }

    public static String reverseString(String original) {
        String normalized = original.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed.append(normalized.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverseStringByStream(String original) {
        return IntStream.range(0, original.length())
                .map(i -> original.charAt(original.length() - i - 1))
                .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
                .toString();
    }

    public static String reverseStringByCharArray(String original) {
        char[] chars = original.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--){
            sb = sb.append(chars[i]);

        }
        return sb.toString();
    }

    public static String reverseStringByStreamChar(String original) {
        return IntStream.range(0, original.length())
                .map(i -> original.charAt(original.length() - i - 1))

                .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
                .toString();


    }

}
